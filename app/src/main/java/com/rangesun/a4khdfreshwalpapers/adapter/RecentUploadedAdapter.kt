package com.rangesun.a4khdfreshwalpapers.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ablanco.zoomy.Zoomy
import com.bumptech.glide.Glide
import com.rangesun.a4khdfreshwalpapers.FinalWallpaper
import com.rangesun.a4khdfreshwalpapers.R
import com.rangesun.a4khdfreshwalpapers.databinding.RecentUploadedItemBinding
import com.rangesun.a4khdfreshwalpapers.model.RecentUploaded

class RecentUploadedAdapter(
    private val requiredContext: Context,
    private val recentUploadedList: ArrayList<RecentUploaded>
) : RecyclerView.Adapter<RecentUploadedAdapter.RecentUploadedHolder>() {

    class RecentUploadedHolder(val binding: RecentUploadedItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentUploadedHolder {
        val binding =
            RecentUploadedItemBinding.inflate(LayoutInflater.from(requiredContext), parent, false)
        return RecentUploadedHolder(binding)
    }

    override fun onBindViewHolder(holder: RecentUploadedHolder, position: Int) {

        //set image
        Glide.with(requiredContext)
            .load(recentUploadedList[position].link)
            .thumbnail(Glide.with(requiredContext).load(R.raw.loadinggrid))
            .into(holder.binding.recentUploadedImage)

        //zoomy builder
        Zoomy.Builder(requiredContext as Activity?)
            .target(holder.binding.recentUploadedImage)
            .enableImmersiveMode(false)
            .tapListener {
                val intent = Intent(requiredContext, FinalWallpaper::class.java)
                intent.putExtra("link", recentUploadedList[position].link)
                requiredContext.startActivity(intent)
            }
            ?.register()


    }

    override fun getItemCount(): Int {
        return recentUploadedList.size
    }
}