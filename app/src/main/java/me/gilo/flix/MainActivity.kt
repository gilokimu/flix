package me.gilo.flix

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import me.gilo.flix.ui.home.HomeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(baseContext, HomeActivity::class.java))
    }
}
