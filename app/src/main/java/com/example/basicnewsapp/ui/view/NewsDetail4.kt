package com.example.basicnewsapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.basicnewsapp.R
import com.example.basicnewsapp.databinding.FragmentNewsDetail4Binding
import com.example.basicnewsapp.ui.model.NewsFeatures

class NewsDetail4 : Fragment() {

    lateinit var binding : FragmentNewsDetail4Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_news_detail4,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsFeatures = NewsFeatures("Austria man kept dead mother in cellar for pension, police say","Date: 05.02.2020","Author : Cenk Tosun")

        binding.newsFeature = newsFeatures

        binding.apply {
            newsFeatures.apply {
                news4Author.text = author
                news4Date.text = date
                news4Label.text = labelOfNews
            }
        }
    }
}