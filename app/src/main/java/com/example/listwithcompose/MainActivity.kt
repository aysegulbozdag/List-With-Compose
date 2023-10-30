package com.example.listwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.listwithcompose.data.model.StudentInfo
import com.example.listwithcompose.ui.theme.ListWithComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ListWithComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val students = listOf(
                        StudentInfo("Ayşegül", "Bozdağ", 301, 4, R.drawable.baseline_person_24),
                        StudentInfo("Ayşegül", "Bozdağ", 302, 4, R.drawable.baseline_person_24),
                        StudentInfo("Ayşegül", "Bozdağ", 303, 4, R.drawable.baseline_person_24),
                        StudentInfo("Ayşegül", "Bozdağ", 304, 4, R.drawable.baseline_person_24)
                    )
                    AllStudents(students)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListWithComposeTheme {
        val students = listOf(
            StudentInfo("Ayşegül", "Bozdağ", 301, 4, R.drawable.baseline_person_24),
            StudentInfo("Ayşegül", "Bozdağ", 302, 4, R.drawable.baseline_person_24),
            StudentInfo("Ayşegül", "Bozdağ", 303, 4, R.drawable.baseline_person_24),
            StudentInfo("Ayşegül", "Bozdağ", 304, 4, R.drawable.baseline_person_24)
        )
        AllStudents(studentList = students)
    }
}