package com.nestorcicardini.simpletodoapp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvTask: AppCompatTextView = view.findViewById(R.id.tvTask)
    private val cbTask: CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task) {
        cbTask.setOnCheckedChangeListener { _, isChecked ->
            task.isSelected = isChecked

            if (isChecked) {
                tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                tvTask.setTextColor(
                    ContextCompat.getColor(
                        cbTask.context,
                        R.color.background_disabled
                    )
                )
            } else {
                tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
                tvTask.setTextColor(
                    ContextCompat.getColor(
                        cbTask.context,
                        R.color.white
                    )
                )
            }
        }

        cbTask.isChecked = task.isSelected

        tvTask.text = task.name

        val currentColor = when (task.category) {
            TaskCategory.Business -> R.color.business_category
            TaskCategory.Other -> R.color.other_category
            TaskCategory.Personal -> R.color.personal_category
        }

        cbTask.buttonTintList =
            ColorStateList.valueOf(ContextCompat.getColor(cbTask.context, currentColor))
    }
}