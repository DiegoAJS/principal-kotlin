package com.proyecto.principal.ui.`object`

import android.content.Context
import android.content.Intent
import android.util.Log
import com.proyecto.principal.pojo.Person
import com.proyecto.principal.ui.activity.PersonActivity
import com.proyecto.principal.ui.constans.ConstansPerson
import java.lang.reflect.InvocationTargetException

object PersonActivityObject {
    init {
        Log.d("TAG","init object PersonActivityObject")
    }
    fun startActivity(context:Context, person: Person){
        val intent = Intent(context,PersonActivity::class.java)
        intent.putExtra(ConstansPerson.AVATAR,person.avatar)
        intent.putExtra(ConstansPerson.CI,person.ci)
        intent.putExtra(ConstansPerson.NAME,person.name)
        intent.putExtra(ConstansPerson.LASTNAME,person.lastname)
        intent.putExtra(ConstansPerson.PHONE,person.phone)
        intent.putExtra(ConstansPerson.DESCRIPTION,person.description)
        context.startActivity(intent)
    }
}