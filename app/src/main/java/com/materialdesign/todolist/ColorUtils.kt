package com.materialdesign.todolist

import androidx.core.graphics.toColorInt

object ColorUtils {
    private val COLORS = listOf(
        "#FFB6C1", // Light Pink
        "#FFA07A", // Light Salmon
        "#98FB98", // Pale Green
        "#FFFACD", // Lemon Chiffon
        "#AFEEEE"  // Pale Turquoise
    )

    fun getRandomColor(): Int {
        val colorHex = COLORS.random()
        return colorHex.toColorInt()
    }
}