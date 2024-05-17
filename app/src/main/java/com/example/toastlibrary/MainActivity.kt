package com.example.toastlibrary

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.toastclass.CustomSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var click = findViewById<Button>(R.id.clickOnButton)

        click.setOnClickListener {
            CustomSnackBar.showSnackBar(click, "Click Button is working....")
        }
    }
}