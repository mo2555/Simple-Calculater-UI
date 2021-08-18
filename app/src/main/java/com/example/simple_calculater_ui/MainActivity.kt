package com.example.simple_calculater_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var button: Button
    var text = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        button = findViewById(R.id.btn1)
        button.setOnClickListener {
            if(editText1.text.toString().isEmpty()&&editText2.text.toString().isEmpty())
                ToastMessage("Please enter number 1 and number 2")
            else if(editText1.text.toString().isEmpty())
                ToastMessage("Please enter number 1")
            else if(editText2.text.toString().isEmpty())
                ToastMessage("Please enter number 2")
            else if(editText1.text.toString().isNotEmpty()&&editText2.text.toString().isNotEmpty()){
                text = "The sum = ${editText1.text.toString().toDouble()+editText2.text.toString().toDouble()}"
                ToastMessage(text)
            }
            else
                ToastMessage("The number is so huge,Please Enter another number")
        }
    }
}