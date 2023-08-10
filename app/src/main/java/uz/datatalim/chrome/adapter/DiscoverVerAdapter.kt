package uz.datatalim.chrome.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.datatalim.chrome.R
import uz.datatalim.chrome.model.DiscoverModel

class DiscoverVerAdapter(val list: ArrayList<DiscoverModel>):RecyclerView.Adapter<DiscoverVerAdapter.DiscoverViewHolder>() {

    class DiscoverViewHolder(view: View):RecyclerView.ViewHolder(view){

        val ivImage=view.findViewById<ImageView>(R.id.iv_Image)
        val tvContentName=view.findViewById<TextView>(R.id.tv_Contentname)
        val ivProfile=view.findViewById<ImageView>(R.id.iv_UserProfile)
        val tvUsername=view.findViewById<TextView>(R.id.tv_Username)
        val tvSourceAndTime=view.findViewById<TextView>(R.id.tv_Source_and_Time)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoverViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_chrome_ver,parent,false)
        return DiscoverViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: DiscoverViewHolder, position: Int) {

        val discoverList=list[position]
        Glide.with(holder.ivImage).load(discoverList.image).into(holder.ivImage)
        holder.tvContentName.text=discoverList.contentName
        Glide.with(holder.ivProfile).load(discoverList.profile).into(holder.ivProfile)
        holder.tvUsername.text=discoverList.username
        holder.tvSourceAndTime.text=discoverList.sourceAndTime


    }

}