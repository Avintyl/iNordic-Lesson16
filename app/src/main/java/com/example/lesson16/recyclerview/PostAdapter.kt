package com.example.lesson16.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson16.R
import com.example.lesson16.recyclerview.models.Post
import kotlinx.android.synthetic.main.post_adapter_item.view.*

class PostAdapter : RecyclerView.Adapter<PostViewHolder>() {

    var postList = listOf<Post>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.post_adapter_item, parent))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(postList[position].postTitle, postList[position].postImageResource)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

}

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            Toast.makeText(itemView.context, "Hell! o-o-o-o...", Toast.LENGTH_SHORT).show()
        }
    }

    fun bind(postTitle: String, postImageResource: Int) {
        itemView.ivPostPicture.setImageResource(postImageResource)
        itemView.tvPostTitle.text = postTitle
    }
}