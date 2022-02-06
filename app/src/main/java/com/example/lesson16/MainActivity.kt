package com.example.lesson16

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson16.common.Navigation
import com.example.lesson16.recyclerview.PostAdapter
import com.example.lesson16.recyclerview.models.Post
import com.example.lesson16.ui.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Navigation.navigateToFragmentFromActivity(MainFragment(), this)
    }


}