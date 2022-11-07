package com.marc.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.marc.recyclerview.Adaptador

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persones = findViewById<RecyclerView>(R.id.rvPersonas)
        persones.layoutManager = LinearLayoutManager(this)

        val listaEquipos = ArrayList<Objecte>()

        listaEquipos.add(Objecte("Marc Gutiérrez", "12345678L", 111222333))
        listaEquipos.add(Objecte("Esteban Arquillo", "87654321A", 444555666))
        listaEquipos.add(Objecte("Joan Roura", "98765432R", 363636363))
        listaEquipos.add(Objecte("Joan Garcia", "11223344V", 298363711))
        listaEquipos.add(Objecte("Didac Gros", "99825531D", 987324154))

        val adaptadorPersona = Adaptador(listaEquipos)
        persones.adapter = adaptadorPersona
    }
}