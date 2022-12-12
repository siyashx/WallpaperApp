package com.rangesun.a4khdfreshwalpapers.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rangesun.a4khdfreshwalpapers.ImageListActivity
import com.rangesun.a4khdfreshwalpapers.R
import com.rangesun.a4khdfreshwalpapers.databinding.CategoriesItemBinding
import com.rangesun.a4khdfreshwalpapers.model.Categories

class CategoriesAdapter(private val requireContext: Context, private val categoriesList: ArrayList<Categories>) : RecyclerView.Adapter<CategoriesAdapter.CategoriesHolder>() {
    class CategoriesHolder(val binding: CategoriesItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesHolder {
        val binding = CategoriesItemBinding.inflate(LayoutInflater.from(requireContext), parent, false)
        return CategoriesHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoriesHolder, position: Int) {
        //set image
        Glide.with(requireContext)
            .load(categoriesList[position].link)
            .thumbnail(Glide.with(requireContext).load(R.raw.loadingcategory))
            .into(holder.binding.categoriesImage)

        //item click listener
        holder.itemView.setOnClickListener {
            //intent data image list activity

            when(categoriesList[position].id) {
                "Abstract" -> {
                    //abstract
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Abstract")
                    requireContext.startActivity(intent)
                }

                "Amoled" -> {
                    //amoled
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Amoled")
                    requireContext.startActivity(intent)
                }

                "Anime" -> {
                    //anime
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Anime")
                    requireContext.startActivity(intent)
                }

                "Exclusive" -> {
                    //exclusive
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Exclusive")
                    requireContext.startActivity(intent)
                }

                "Games" -> {
                    //amoled
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Games")
                    requireContext.startActivity(intent)
                }

                "Gradient" -> {
                    //gradient
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Gradient")
                    requireContext.startActivity(intent)
                }

                "Minimal" -> {
                    //minimal
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Minimal")
                    requireContext.startActivity(intent)
                }

                "Nature" -> {
                    //nature
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Nature")
                    requireContext.startActivity(intent)
                }

                "Shapes" -> {
                    //shapes
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Shapes")
                    requireContext.startActivity(intent)
                }

                "Shows" -> {
                    //shows
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Shows")
                    requireContext.startActivity(intent)
                }

                "Sports" -> {
                    //sports
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Sports")
                    requireContext.startActivity(intent)
                }

                "Stocks" -> {
                    //stocks
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Stocks")
                    requireContext.startActivity(intent)
                }

                "Superheroes" -> {
                    //superheroes
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Superheroes")
                    requireContext.startActivity(intent)
                }
            }
        }

    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }
}