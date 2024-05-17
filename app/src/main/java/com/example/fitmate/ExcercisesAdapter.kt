package com.example.fitmate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView

class ExcercisesAdapter(
    val context: Context,
    val array: ArrayList<Excercises>,
    val onItemClickList: List<(Excercises) -> Unit>
) : RecyclerView.Adapter<ExcercisesAdapter.ExcercisesViewHolder>() {

    inner class ExcercisesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageButton: ImageButton = itemView.findViewById(R.id.imageButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExcercisesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.excercises_list, parent, false)
        return ExcercisesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ExcercisesViewHolder, position: Int) {
        val excercise = array[position]
        holder.imageButton.setImageResource(excercise.image)
        holder.itemView.setOnClickListener { onItemClickList[position](excercise) }
    }
}
