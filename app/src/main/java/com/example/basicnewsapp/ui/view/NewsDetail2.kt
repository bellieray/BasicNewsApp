package com.example.basicnewsapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.basicnewsapp.R
import com.example.basicnewsapp.databinding.FragmentNewsDetail2Binding
import com.example.basicnewsapp.ui.model.NewsFeatures


class NewsDetail2 : Fragment() {
    lateinit var binding : FragmentNewsDetail2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_news_detail2,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsFeatures = NewsFeatures("North Korea: Military parade features hazmat suits, gas masks","Date: 03.02.2020","Author : Mohammed Salah")

        binding.newsFeature = newsFeatures

        binding.apply {
            newsFeatures.apply {
                news2Author.text = author
                news2Date.text = date
                news2Label.text = labelOfNews
            }
        }
    }

}