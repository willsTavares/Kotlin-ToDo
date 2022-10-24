package com.example.todolistlive

interface TaskItemClickListener {

    fun editTask(taskItem: TaskItem)
    fun completeTask(taskItem: TaskItem)
}