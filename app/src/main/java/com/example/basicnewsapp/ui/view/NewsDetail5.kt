package com.example.basicnewsapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.basicnewsapp.R
import com.example.basicnewsapp.databinding.FragmentNewsDetail5Binding
import com.example.basicnewsapp.ui.model.NewsFeatures

class NewsDetail5 : Fragment() {
    lateinit var binding : FragmentNewsDetail5Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_news_detail5,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsFeatures = NewsFeatures("US Biden and China's Xi hold first call in seven months","Date: 06.02.2020","Author : Cenk Tosun")

        binding.newsFeature = newsFeatures

        binding.apply {
            newsFeatures.apply {
                news5Author.text = author
                news5Date.text = date
                news5Label.text = labelOfNews
            }
        }
    }
}