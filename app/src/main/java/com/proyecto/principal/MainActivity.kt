package com.proyecto.principal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.proyecto.principal.ui.fragment.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG_MAIN","Hola iniciamos")
        // Get the text fragment instance
        val textFragment = ListFragment()

        // Get the support fragment manager instance
        val manager = supportFragmentManager

        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()

        // Replace the fragment on container
        transaction.replace(R.id.Rcontent,textFragment)
        transaction.addToBackStack(null)

        // Finishing the transition
        transaction.commit()
    }


}