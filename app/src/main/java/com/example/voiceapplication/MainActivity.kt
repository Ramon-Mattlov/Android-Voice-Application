package com.example.voiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD
    }
}
=======

        val name: String = "Nikita"
        val surname: String = "Shumskii"
        val age: Int  = 26
        var heigth: Double = 180.0

        val output: output = findViewById(R.id.output)
        output.text = name

    }
}/
>>>>>>> 9be9067 (Project initialization)
