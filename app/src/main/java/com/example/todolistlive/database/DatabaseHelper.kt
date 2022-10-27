package com.example.todolistlive.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.todolistlive.TaskItem

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        private val DB_NAME = "task"
        private val DB_VERSION = 1
        private val ID = "id"
        private val TASK_NAME = "taskName"
        private val TASK_DETAILS = "taskDetails"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($ID INTEGER PRIMARY KEY, $TASK_NAME TEXT, $TASK_DETAILS)"
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

/*    fun getListTask(): List<TaskItem> {
        val taskList = ArrayList<TaskItem>()
        val db: SQLiteDatabase = writableDatabase
        val selectQuery = "SELECT * FROM $TABLE_NAME"
        val cursor: Cursor =
    }*/
}