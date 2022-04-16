package com.example.customview16042022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText1 = findViewById<EditText>(R.id.edit_query)
        val editText2 = findViewById<EditText>(R.id.edit_query2)
        val textView = findViewById<TextView>(R.id.text)
        val button = findViewById<Button>(R.id.dialog_button)
        val buttonEnable = findViewById<Button>(androidx.constraintlayout.widget.R.id.end)



        button.setOnClickListener {
            textView.text = editText1.text.toString() + editText2.text.toString()
            editText1.setText("")
            editText2.setText("")
        }

        buttonEnable.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                textView.text = ""
            }, 3000)

        }
    }

}


