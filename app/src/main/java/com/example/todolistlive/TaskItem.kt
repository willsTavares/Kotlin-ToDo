package com.example.todolistlive

import java.util.*

class TaskItem (
    var name: String,
    var desc: String,
    var completed: Boolean,
    var id: UUID = UUID.randomUUID(),
) {

    fun isCompleted() = !completed
    fun imageResource(): Int = if (isCompleted()) R.drawable.ic_unchecked else R.drawable.ic_checked


}