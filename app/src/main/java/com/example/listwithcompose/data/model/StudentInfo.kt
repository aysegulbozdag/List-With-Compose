package com.example.listwithcompose.data.model

import androidx.compose.runtime.Composable

data class StudentInfo(
    val name: String,
    val surname: String,
    val studentNumber: Int,
    val grade: Int,
    val imageRes: Int
)
