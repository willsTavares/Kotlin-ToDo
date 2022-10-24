package com.example.todolistlive

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class TaskViewModel : ViewModel()
{
    var taskItems = MutableLiveData<MutableList<TaskItem>>()

    init {
        taskItems.value = mutableListOf()
    }

    fun addTaskItem(newTask: TaskItem){
        val list = taskItems.value
        list!!.add(newTask)
        taskItems.postValue(list)
    }

    fun uptadeTaskItem(id: UUID, name: String, desc: String){
        val list = taskItems.value
        val task = list!!.find { it.id == id}!!

        task.name = name
        task.desc = desc
        taskItems.postValue(list)
    }

    fun setCompleted(taskItem: TaskItem){
        val list = taskItems.value
        val task = list!!.find { it.id == taskItem.id}!!

       if(!task.completed){
           task.completed = true
       }
        taskItems.postValue(list)
    }



}