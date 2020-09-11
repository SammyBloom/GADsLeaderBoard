package com.example.gadsleaderboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gadsleaderboard.model.LeaderBoard
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class RecyclerAdapter(private val recyclerList: List<LeaderBoard>) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.image_view
        val learners_name: TextView = itemView.leader_name
        val learners_description: TextView = itemView.leader_description
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,
        parent, false)

        return RecyclerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentItem = recyclerList[position]

//        holder.imageView.setImageResource(currentItem.imageResource)
//        holder.textName.text = currentItem.leaderName
//        holder.textDescription.text = currentItem.leaderDescription

    }

    override fun getItemCount() = recyclerList.size
}