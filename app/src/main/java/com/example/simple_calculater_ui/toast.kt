package com.example.simple_calculater_ui

import android.app.Activity
import android.widget.Toast

fun Activity.ToastMessage(str:String){
    Toast.makeText(this,str, Toast.LENGTH_LONG).show()
}

