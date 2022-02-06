package com.example.lesson16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson16.recyclerview.PostAdapter
import com.example.lesson16.recyclerview.models.Post

class MainActivity : AppCompatActivity() {

    private val postList = listOf<Post>(
        Post("It's first post!", R.drawable.first_post),
        Post("It's second attention!", R.drawable.second_post),
        Post("Stop now! Stop!", R.drawable.last_attention),
        Post("You are dead...", R.drawable.dead_men)
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun initAdapter() {
        val adapter = PostAdapter()
        adapter.postList = postList
    }
}