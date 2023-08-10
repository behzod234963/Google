package uz.datatalim.chrome.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.datatalim.chrome.R
import uz.datatalim.chrome.model.SearchModel

class SearchHozAdapter(val list:ArrayList<SearchModel>):RecyclerView.Adapter<SearchHozAdapter.SearchHozHolder>() {

    class SearchHozHolder(view:View):RecyclerView.ViewHolder(view){

        val llSearch=view.findViewById<LinearLayout>(R.id.ll_search_item)
        val ivSearch=view.findViewById<ImageView>(R.id.iv_search_item)
        val tvText=view.findViewById<TextView>(R.id.tv_text_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHozHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_chrome,parent,false)
        return SearchHozHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SearchHozHolder, position: Int) {

        val searchContent=list[position]
        holder.tvText.text=searchContent.text
        holder.ivSearch.setImageResource(searchContent.image)

    }

}