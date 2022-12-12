package com.rangesun.a4khdfreshwalpapers.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rangesun.a4khdfreshwalpapers.ImageListActivity
import com.rangesun.a4khdfreshwalpapers.R
import com.rangesun.a4khdfreshwalpapers.databinding.CatalogItemBinding
import com.rangesun.a4khdfreshwalpapers.model.Catalogs

class CatalogAdapter(private val requireContext: Context, private val catalogList: ArrayList<Catalogs>) :
    RecyclerView.Adapter<CatalogAdapter.CatalogHolder>() {
    class CatalogHolder(val binding: CatalogItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogHolder {
        val binding = CatalogItemBinding.inflate(LayoutInflater.from(requireContext), parent, false)
        return CatalogHolder(binding)
    }

    override fun onBindViewHolder(holder: CatalogHolder, position: Int) {

        //set image
        Glide.with(requireContext)
            .load(catalogList[position].link)
            .thumbnail(Glide.with(requireContext).load(R.raw.loadingcatalog))
            .into(holder.binding.catalogImage)

        //item click listener
        holder.itemView.setOnClickListener {
            //intent data image list activity
            when (catalogList[position].id) {

                "Spiderman" -> {
                    //superheroes
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Spiderman")
                    requireContext.startActivity(intent)
                }
                "Depth Effect" -> {
                    //depth effect
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Depth Effect")
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
                "Space" -> {
                    //nature
                    val intent = Intent(requireContext, ImageListActivity::class.java)
                    intent.putExtra("id", "Space")
                    requireContext.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return catalogList.size
    }

}