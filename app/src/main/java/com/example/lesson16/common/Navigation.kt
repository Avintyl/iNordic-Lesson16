package com.example.lesson16.common

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.lesson16.R

object Navigation {

    fun navigateToFragmentFromActivity(fragment: Fragment, activity: AppCompatActivity) {
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    fun navigateToFragmentFromFragmentActivity(fragment: Fragment, fragmentActivity: FragmentActivity) {
        fragmentActivity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}