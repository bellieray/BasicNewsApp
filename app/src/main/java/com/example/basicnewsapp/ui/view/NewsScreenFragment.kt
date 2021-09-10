package com.example.basicnewsapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.basicnewsapp.R
import com.example.basicnewsapp.databinding.FragmentNewsScreenBinding

class NewsScreenFragment : Fragment() {
lateinit var binding : FragmentNewsScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_news_screen,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.news1, NewsDetail1())?.commit()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.news2, NewsDetail2())?.commit()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.news3, NewsDetail3())?.commit()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.news4, NewsDetail4())?.commit()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.news5, NewsDetail5())?.commit()

            news1.setOnClickListener {
                (activity as MainActivity).supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_right,R.anim.slide_in_right,R.anim.slide_out_left).replace(R.id.mainActivityFrame,
                    NewsDetail1()
                ).addToBackStack("").commit()
            }

            news2.setOnClickListener {
                (activity as MainActivity).supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_right,R.anim.slide_in_right,R.anim.slide_out_left).replace(R.id.mainActivityFrame,
                    NewsDetail2()
                ).addToBackStack("").commit()
            }
            news3.setOnClickListener {
                (activity as MainActivity).supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_right,R.anim.slide_in_right,R.anim.slide_out_left).replace(R.id.mainActivityFrame,
                    NewsDetail3()
                ).addToBackStack("").commit()
            }

            news4.setOnClickListener {
                (activity as MainActivity).supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_right,R.anim.slide_in_right,R.anim.slide_out_left).replace(R.id.mainActivityFrame,
                    NewsDetail4()
                ).addToBackStack("").commit()
            }

            news5.setOnClickListener {
                (activity as MainActivity).supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_right,R.anim.slide_in_right,R.anim.slide_out_left).replace(R.id.mainActivityFrame,
                    NewsDetail5()
                ).addToBackStack("").commit()
            }

        }
    }
}

