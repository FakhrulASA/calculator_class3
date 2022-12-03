package com.fakhrulasa.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var numberOne: EditText
    lateinit var numberTwo: EditText
    lateinit var addButton: Button
    lateinit var answerTv: TextView
    var numOne: Int? = null
    var numTwo: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //view created
        setContentView(R.layout.activity_main)

        numberOne = findViewById(R.id.number_one)
        numberTwo = findViewById(R.id.number_two)
        addButton = findViewById(R.id.add_button)
        answerTv = findViewById(R.id.answer_tv)

        addButton.setOnClickListener {
            if (numberOne.text.isNullOrBlank() || numberTwo.text.isNullOrBlank()) {
                answerTv.text = "Please giver a proper input"
            } else {
                numOne = numberOne.text.toString().toInt()
                numTwo = numberTwo.text.toString().toInt()
                answerTv.text = (numOne!! + numTwo!!).toString()
                var nextPage = Intent(this, ResultActivity::class.java)
                startActivity(nextPage)
            }
        }
    }
}