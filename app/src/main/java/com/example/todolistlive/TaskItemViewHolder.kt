package com.example.todolistlive

import android.content.Context
import android.graphics.Paint
import androidx.recyclerview.widget.RecyclerView
import com.example.todolistlive.databinding.TaskItemCellBinding

class TaskItemViewHolder(
    private val context: Context,
    private val binding: TaskItemCellBinding,
    private val clickListener: TaskItemClickListener
): RecyclerView.ViewHolder(binding.root) {

    fun bindTaskItem(taskItem: TaskItem)
    {
        binding.name.text = taskItem.name

        if(taskItem.isCompleted()){
            binding.name.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
        }
        binding.completeBtn.setImageResource(taskItem.imageResource())
        binding.completeBtn.setOnClickListener{
            clickListener.completeTask(taskItem)
        }
        binding.taskCellContainer.setOnClickListener{
            clickListener.editTask(taskItem)
        }
    }
}