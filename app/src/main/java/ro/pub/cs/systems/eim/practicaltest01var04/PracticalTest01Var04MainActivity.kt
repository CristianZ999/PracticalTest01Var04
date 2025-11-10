package ro.pub.cs.systems.eim.practicaltest01var04

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class PracticalTest01Var04MainActivity : AppCompatActivity() {

    private lateinit var navigateToSecondaryActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var04_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //navigateToSecondaryActivityButton = findViewById<(R.id.navigate_to_secondary_activity_button)
        //navigateToSecondaryActivityButton.setOnClickListener {
            // Acest cod este chemat la apasarea unui buton
        //}
    }
}