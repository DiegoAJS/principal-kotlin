package com.proyecto.principal.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.proyecto.principal.R
import com.proyecto.principal.pojo.Person
import com.proyecto.principal.pojo.Pojo
import com.proyecto.principal.ui.adapterview.ItemAdapter


class ListFragment : Fragment() {

    var items=ArrayList<Pojo>()

    companion object {

        fun newInstance(): ListFragment {
            return ListFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(
            R.layout.fragment_list,
            container,
            false
        )

        getDataPerson()
        viewDataPerson(view)

        return view
    }

    fun getDataPerson(){
        items.add(Person("","Calor","Mamami",78345,"+591 73175487","soy una persona buena "))
        items.add(Person("","Jose","Peral",78845,"+591 73775487","soy una persona buena "))
        items.add(Person("","Richar","Perez",77745,"+591 73355487","soy una persona buena "))

        items.add(Person("","Calor","Mamami",78345,"+591 73175487","soy una persona buena "))
        items.add(Person("","Jose","Peral",78845,"+591 73775487","soy una persona buena "))
        items.add(Person("","Richar","Perez",77745,"+591 73355487","soy una persona buena "))

        items.add(Person("","Calor","Mamami",78345,"+591 73175487","soy una persona buena "))
        items.add(Person("","Jose","Peral",78845,"+591 73775487","soy una persona buena "))
        items.add(Person("","Richar","Perez",77745,"+591 73355487","soy una persona buena "))
    }

    fun viewDataPerson(view:View){
        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview_list)
        recyclerView.layoutManager=LinearLayoutManager(context)
        recyclerView.adapter= ItemAdapter(items)

    }
}