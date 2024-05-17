package com.example.toastlibrary

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click = findViewById<Button>(R.id.clickOnButton)

        click.setOnClickListener {
//            CustomSnackBarNew.CustomClass(click, "Message")
//            CustomSnackBar.showSnackBar(click, "Message")
        }
    }
}