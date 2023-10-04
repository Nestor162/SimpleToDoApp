package com.nestorcicardini.simpletodoapp

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName: AppCompatTextView = view.findViewById(R.id.tvCategoryName)
    private val divider: View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory) {

        when (taskCategory) {
            TaskCategory.Business -> {
//                tvCategoryName.text = context.getString(R.string.business)
                tvCategoryName.text = "Business"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.business_category)
                )
            }

            TaskCategory.Other -> {
//                tvCategoryName.text = context.getString(R.string.other)
                tvCategoryName.text = "Other"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.other_category)
                )
            }

            TaskCategory.Personal -> {
//                tvCategoryName.text = context.getString(R.string.personal)
                tvCategoryName.text = "Personal"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.personal_category)
                )
            }
        }

    }
}