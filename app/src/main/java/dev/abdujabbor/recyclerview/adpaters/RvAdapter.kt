package dev.abdujabbor.recyclerview.adpaters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.abdujabbor.recyclerview.databinding.LinearitemBinding

class RvAdapter(var list: ArrayList<String>) : RecyclerView.Adapter<RvAdapter.VH>() {
    inner class VH(var itemviewBinding: LinearitemBinding) :
        RecyclerView.ViewHolder(itemviewBinding.root) {
        fun onBind(list: String) {
            itemviewBinding.text.text = list
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LinearitemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        return holder.onBind(list[position])
    }
}