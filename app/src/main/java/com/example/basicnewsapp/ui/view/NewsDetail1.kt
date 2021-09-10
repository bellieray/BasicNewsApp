package com.example.basicnewsapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.basicnewsapp.R
import com.example.basicnewsapp.databinding.FragmentNewsDetail1Binding
import com.example.basicnewsapp.ui.model.NewsFeatures

/**
 * A simple [Fragment] subclass.
 * Use the [NewsDetail1.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewsDetail1 : Fragment() {
    lateinit var binding : FragmentNewsDetail1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_news_detail1,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val newsFeatures = NewsFeatures("For Health Wash Your Hands","Date: 02.02.2020","Author : James Milner")
        binding.newsFeature = newsFeatures
        binding.apply {
            newsFeatures.apply {
                news1Author.text = author
                news1Date.text = date
                news1Label.text = labelOfNews
            }
        }
    }

}