package com.chudnovskiy.lab_47_relativelayoutsample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val editText: EditText
        val textView: TextView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        editText = findViewById(R.id.entry)
        textView = findViewById(R.id.textView)

        val buttonCancel: Button = findViewById(R.id.cancel_button)
        val buttonOk: Button = findViewById(R.id.ok_button)

        buttonCancel.setOnClickListener {
            editText.setText("")
            textView.setText("")
        }

        buttonOk.setOnClickListener {
            textView.text = editText.text
            textView.setTextColor(Color.WHITE)
        }
    }
}