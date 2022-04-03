package net.srutschilling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected var num = 0

    private fun display(number: Int) {
        val quantityTextView = findViewById<View>(R.id.textView4) as TextView
        quantityTextView.text = "" + number
    }

    fun ButtonPress(view: View?) {
        num++
        display(num)
    }

}