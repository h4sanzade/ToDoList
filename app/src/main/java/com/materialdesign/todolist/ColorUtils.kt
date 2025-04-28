package com.materialdesign.todolist

import androidx.core.graphics.toColorInt

object ColorUtils {
    private val COLORS = listOf(
        "#FFB6C1",
        "#FFA07A",
        "#98FB98",
        "#FFFACD",
        "#AFEEEE"
    )

    fun getRandomColor(): Int {
        val colorHex = COLORS.random()
        return colorHex.toColorInt()
    }
}