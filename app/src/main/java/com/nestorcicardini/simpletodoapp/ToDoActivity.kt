package com.nestorcicardini.simpletodoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ToDoActivity : AppCompatActivity() {

    private var categories = listOf(
        TaskCategory.Business,
        TaskCategory.Personal,
        TaskCategory.Other

    )

    private var tasks = mutableListOf(
        Task("Business test", TaskCategory.Business),
        Task("Personal test", TaskCategory.Personal),
        Task("Other test", TaskCategory.Other)
    )

    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var rvTasks: RecyclerView
    private lateinit var taskAdapter: TaskAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)
        initComponent()
        initUI()
    }


    private fun initComponent() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        taskAdapter = TaskAdapter(tasks)
        rvTasks.layoutManager =
            LinearLayoutManager(this)
        rvTasks.adapter = taskAdapter
    }
}
