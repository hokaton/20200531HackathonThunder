package com.tistory.comfy91.a20200531hackathonthunder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img_profile = itemView.findViewById<ImageView>(R.id.img_profile)
    val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
    val tv_contents = itemView.findViewById<TextView>(R.id.tv_contents)

    fun bind(listItemData: ListItemData) {
        tv_title.text = listItemData.tv_title
        tv_contents.text = listItemData.tv_contents
        Glide.with(itemView).load(listItemData.img_profile).into(img_profile)
    }
}