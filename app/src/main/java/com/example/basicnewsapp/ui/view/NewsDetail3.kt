package com.example.basicnewsapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.basicnewsapp.R
import com.example.basicnewsapp.databinding.FragmentNewsDetail3Binding
import com.example.basicnewsapp.ui.model.NewsFeatures


class NewsDetail3 : Fragment() {
    lateinit var binding : FragmentNewsDetail3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_news_detail3,container,false)
        return binding.root
         }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsFeatures = NewsFeatures("Afghanistan: The 'undefeated' Panjshir Valley - an hour from Kabul","Date: 04.02.2020","Author : Miralem Pjanic")

        binding.newsFeature = newsFeatures

        binding.apply {
            newsFeatures.apply {
                news3Author.text = author
                news3Date.text = date
                news3Label.text = labelOfNews
            }
        }
    }
    }
