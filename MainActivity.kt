package com.example.budgetbuddy

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<EditText>(R.id.title)
        val amount = findViewById<EditText>(R.id.amount)
        val category = findViewById<EditText>(R.id.category)
        val btn = findViewById<Button>(R.id.saveBtn)

        btn.setOnClickListener {

            if (title.text.isEmpty() || amount.text.isEmpty()) {
                Toast.makeText(this, "Fill everything", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val message = "Saved: ${title.text} - R${amount.text} (${category.text})"

            Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            title.text.clear()
            amount.text.clear()
            category.text.clear()
        }
    }
}