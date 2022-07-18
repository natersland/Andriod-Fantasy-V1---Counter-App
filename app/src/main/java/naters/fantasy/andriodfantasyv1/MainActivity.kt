package naters.fantasy.andriodfantasyv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvWelcomeText = findViewById<TextView>(R.id.welcomeText)
        var timesClicked = 0

        btnClickMe.setOnClickListener{
            timesClicked += 1

            btnClickMe.text = "I said don't click me!"
            tvWelcomeText.text = "Violent click counter: ${timesClicked.toString()}"
            Toast.makeText(this, "Welcome to my fantasy world!", Toast.LENGTH_LONG).show()
        }

    }
}