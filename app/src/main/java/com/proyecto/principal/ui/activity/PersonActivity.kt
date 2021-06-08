package com.proyecto.principal.ui.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.proyecto.principal.R
import com.proyecto.principal.pojo.Person
import com.proyecto.principal.ui.constans.ConstansPerson

class PersonActivity:AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menu_account -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_call -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_editar -> {

                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)
        getDataPerson()
        viewEvent()
    }

    fun getDataPerson(){
        val avatar= intent.getStringExtra(ConstansPerson.AVATAR)
        val ci = intent.getIntExtra(ConstansPerson.CI,0)
        val name = intent.getStringExtra(ConstansPerson.NAME)
        val lastname = intent.getStringExtra(ConstansPerson.LASTNAME)
        val phone = intent.getStringExtra(ConstansPerson.PHONE)
        val description = intent.getStringExtra(ConstansPerson.DESCRIPTION)

        Glide
            .with(this)
            .load("https://media.kasperskydaily.com/wp-content/uploads/sites/88/2019/12/09182151/android-device-identifiers-featured.jpg")
            .centerCrop()
            .into(findViewById<ImageView>(R.id.image_avatar_activity))
        findViewById<TextView>(R.id.text_ci_activity).text=ci.toString()
        findViewById<TextView>(R.id.text_name_activity).text=name
        findViewById<TextView>(R.id.text_lastname_activity).text=lastname
        findViewById<TextView>(R.id.text_phone_activity).text=phone
        findViewById<TextView>(R.id.text_description_activity).text=description


    }

    fun viewEvent(){
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_person)
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        
    }



}