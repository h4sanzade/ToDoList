package com.materialdesign.todolist

data class Note(
    val id: Long = System.currentTimeMillis(),
    val text: String,
    val backgroundColor: Int
)