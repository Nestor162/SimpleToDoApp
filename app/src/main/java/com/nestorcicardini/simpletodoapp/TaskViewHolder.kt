package com.nestorcicardini.simpletodoapp

import android.view.View
import android.widget.CheckBox
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvTask: AppCompatTextView = view.findViewById(R.id.tvTask)
    private val cbTask: CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task) {
        tvTask.text = task.name
    }
}