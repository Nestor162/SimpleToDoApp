package com.nestorcicardini.simpletodoapp

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName: AppCompatTextView = view.findViewById(R.id.tvCategoryName)
    private val divider: View = view.findViewById(R.id.divider)
    private val cvCategoryContainer: CardView = view.findViewById(R.id.cvCategoryContainer)

    fun render(taskCategory: TaskCategory, onCategorySelected: (Int) -> Unit) {

        val currentColor =
            if (taskCategory.isSelected) R.color.background_card else R.color.background_disabled

        cvCategoryContainer.setCardBackgroundColor(
            ContextCompat.getColor(
                cvCategoryContainer.context,
                currentColor
            )
        )


        itemView.setOnClickListener { onCategorySelected(layoutPosition) }
        when (taskCategory) {
            TaskCategory.Business -> {
                tvCategoryName.text = tvCategoryName.context.getString(R.string.business)
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.business_category)
                )
            }

            TaskCategory.Other -> {
                tvCategoryName.text = tvCategoryName.context.getString(R.string.other)
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.other_category)
                )
            }

            TaskCategory.Personal -> {
                tvCategoryName.text = tvCategoryName.context.getString(R.string.personal)
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.personal_category)
                )
            }
        }

    }
}