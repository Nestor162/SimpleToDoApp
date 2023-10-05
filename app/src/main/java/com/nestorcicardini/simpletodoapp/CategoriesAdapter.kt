package com.nestorcicardini.simpletodoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CategoriesAdapter(private val categories: List<TaskCategory>) :
    RecyclerView.Adapter<CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount() = categories.size


    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val context = holder.itemView.context
        holder.render(categories[position], context)
    }

}
