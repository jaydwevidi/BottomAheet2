package com.example.bottompager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            val sheetDialog = BottomSheetDialog(this , R.style.BottomSheetStyle)
            val view = LayoutInflater.from(this)
                .inflate(
                    R.layout.bottomsheet_dialog ,
                    findViewById<LinearLayout>(R.id.bottomSheetDialog2)
                )

            sheetDialog.setContentView(view)
            sheetDialog.show()
        }
    }
}