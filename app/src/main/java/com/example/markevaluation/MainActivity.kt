package com.example.markevaluation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.markevaluation.ui.theme.MarkEvaluationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val marksInput=findViewById<EditText>(R.id.editMarks)
        val resultText=findViewById<TextView>(R.id.txtResult)
        val button=findViewById<Button>(R.id.btnCheck)
        val resetButton=findViewById<Button>(R.id.btnReset)

        button.setOnClickListener {

            val marks =marksInput.text.toString().toInt()

            if(marks>=80){
                resultText.text="symbol:A"
            }
            else if(marks>=70){
                resultText.text="symbol:B"
            }
            else if(marks>=60){
                resultText.text="symbol:C"
            }
            else if(marks>=50){
                resultText.text="symbol:D"
            }
            else{
                resultText.text="symbol:E"
            }

        }
        //Reset Button

        resetButton.setOnClickListener {
            marksInput.text.clear()
            resultText.text="Result will appear here"
        }
    }
}