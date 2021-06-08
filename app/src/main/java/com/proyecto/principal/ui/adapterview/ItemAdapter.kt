package com.proyecto.principal.ui.adapterview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.proyecto.principal.R
import com.proyecto.principal.pojo.Person
import com.proyecto.principal.pojo.Pojo
import com.proyecto.principal.ui.`object`.PersonActivityObject

class ItemAdapter(val items:ArrayList<Pojo>): RecyclerView.Adapter<ItemAdapter.PersonHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        var layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_person,parent,false)
        return PersonHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        val item=items.get(position)
        when(item){
            is Person -> holder.bindPerson(item)
            /**is Square -> shapeObject.sideLength = 4.0f
            is Rectangle -> {
                shapeObject.length = 5.0f
                shapeObject.breadth = 6.0f
            }
            else -> print(“Undefined type”)
             */
        }


    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PersonHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        public fun bindPerson(person:Person){
            itemView.setOnClickListener(){
                PersonActivityObject.startActivity(itemView.context,person)
            }
            Glide
                .with(itemView.context)
                .load("https://media.kasperskydaily.com/wp-content/uploads/sites/88/2019/12/09182151/android-device-identifiers-featured.jpg")
                .centerCrop()
                .into(itemView.findViewById<ImageView>(R.id.image_avatar_holder))
            itemView.findViewById<TextView>(R.id.text_ci_holder).setText(person.ci.toString())
            itemView.findViewById<TextView>(R.id.text_name_holder).setText(person.name)
            itemView.findViewById<TextView>(R.id.text_lastname_holder).setText(person.lastname)

        }

    }
}