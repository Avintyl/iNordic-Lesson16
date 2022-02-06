package com.example.lesson16.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson16.R
import com.example.lesson16.recyclerview.PostAdapter
import com.example.lesson16.recyclerview.models.Post
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {


    private val postList = listOf<Post>(
        Post("It's first post!", R.drawable.first_post),
        Post("It's second attention!", R.drawable.second_post),
        Post("Stop now! Stop!", R.drawable.last_attention),
        Post("You are dead...", R.drawable.dead_men)
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = PostAdapter()
        adapter.postList = postList
        rvPostContainer.adapter = adapter
        rvPostContainer.layoutManager = LinearLayoutManager(requireContext())
    }

}