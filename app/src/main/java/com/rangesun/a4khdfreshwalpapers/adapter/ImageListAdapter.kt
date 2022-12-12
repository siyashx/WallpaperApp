package com.rangesun.a4khdfreshwalpapers.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rangesun.a4khdfreshwalpapers.FinalWallpaper
import com.rangesun.a4khdfreshwalpapers.R
import com.rangesun.a4khdfreshwalpapers.databinding.ImageListItemBinding
import com.rangesun.a4khdfreshwalpapers.model.ImageList

class ImageListAdapter(private val requiredContext: Context, private val imageList: ArrayList<ImageList>) :
    RecyclerView.Adapter<ImageListAdapter.ImageListHolder>() {


    class ImageListHolder(val binding: ImageListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageListHolder {
        val binding =
            ImageListItemBinding.inflate(LayoutInflater.from(requiredContext), parent, false)
        return ImageListHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageListHolder, position: Int) {

        //set image
        Glide.with(requiredContext)
            .load(imageList[position].link)
            .thumbnail(Glide.with(requiredContext).load(R.raw.loadinggrid))
            .into(holder.binding.imageList)

        //item view click
        holder.itemView.setOnClickListener {
            val intent = Intent(requiredContext, FinalWallpaper::class.java)
            intent.putExtra("link", imageList[position].link)
            requiredContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}