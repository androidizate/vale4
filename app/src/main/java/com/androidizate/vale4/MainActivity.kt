package com.androidizate.vale4

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var puntajeNosotros = 0
    var puntajeEllos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNosotros()
        initEllos()
        btn_reset.setOnClickListener { resetearPuntaje() }
    }

    private fun initEllos() {
        btn_envido_ellos.setOnClickListener { sumarEnvidoEllos() }
        btn_real_envido_ellos.setOnClickListener { sumarRealEnvidoEllos() }
        btn_falta_envido_ellos.setOnClickListener { sumarFaltaEnvidoEllos() }
        btn_truco_ellos.setOnClickListener { sumarTrucoEllos() }
        btn_re_truco_ellos.setOnClickListener { sumarReTrucoEllos() }
        btn_vale_cuatro_ellos.setOnClickListener { sumarValeCuatroEllos() }
        btn_punto_ellos.setOnClickListener { sumarUnoEllos() }
        btn_sumar_uno_ellos.setOnClickListener { sumarUnoEllos() }
        btn_restar_uno_ellos.setOnClickListener { restarUnoEllos() }
    }

    private fun initNosotros() {
        btn_envido_nosotros.setOnClickListener { sumarEnvidoNosotros() }
        btn_real_envido_nosotros.setOnClickListener { sumarRealEnvidoNosotros() }
        btn_falta_envido_nosotros.setOnClickListener { sumarFaltaEnvidoNosotros() }
        btn_truco_nosotros.setOnClickListener { sumarTrucoNosotros() }
        btn_re_truco_nosotros.setOnClickListener { sumarReTrucoNosotros() }
        btn_vale_cuatro_nosotros.setOnClickListener { sumarValeCuatroNosotros() }
        btn_punto_nosotros.setOnClickListener { sumarUnoNosotros() }
        btn_sumar_uno_nosotros.setOnClickListener { sumarUnoNosotros() }
        btn_restar_uno_nosotros.setOnClickListener { restarUnoNosotros() }
    }

    private fun restarUnoEllos() {
        if (isPuntajeEllosMayorACero()) {
            puntajeEllos -= 1
            cambiarScoreEllos()
        }
    }

    private fun restarUnoNosotros() {
        if (isPuntajeNosotrosMayorACero()) {
            puntajeNosotros -= 1
            cambiarScoreNosotros()
        }
    }

    private fun sumarUnoEllos() {
        if (isPuntajeEllosMenorATreinta()) {
            puntajeEllos += 1
            cambiarScoreEllos()
        }
    }

    private fun sumarUnoNosotros() {
        if (isPuntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 1
            cambiarScoreNosotros()
        }
    }

    private fun sumarEnvidoEllos() {
        if (isPuntajeEllosMenorATreinta()) {
            puntajeEllos += 2
            cambiarScoreEllos()
        }
    }

    private fun sumarEnvidoNosotros() {
        if (isPuntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 2
            cambiarScoreNosotros()
        }
    }

    private fun sumarRealEnvidoEllos() {
        if (isPuntajeEllosMenorATreinta()) {
            puntajeEllos += 3
            cambiarScoreEllos()
        }
    }

    private fun sumarRealEnvidoNosotros() {
        if (isPuntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 3
            cambiarScoreNosotros()
        }
    }

    private fun sumarFaltaEnvidoEllos() {
        if (isPuntajeEllosMenorATreinta()) {
            puntajeEllos += 30 - puntajeNosotros
            cambiarScoreEllos()
        }
    }

    private fun sumarFaltaEnvidoNosotros() {
        if (isPuntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 30 - puntajeEllos
            cambiarScoreNosotros()
        }
    }

    private fun sumarTrucoEllos() {
        if (isPuntajeEllosMenorATreinta()) {
            puntajeEllos += 2
            cambiarScoreEllos()
        }
    }

    private fun sumarTrucoNosotros() {
        if (isPuntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 2
            cambiarScoreNosotros()
        }
    }

    private fun sumarReTrucoEllos() {
        if (isPuntajeEllosMenorATreinta()) {
            puntajeEllos += 3
            cambiarScoreEllos()
        }
    }

    private fun sumarReTrucoNosotros() {
        if (isPuntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 3
            cambiarScoreNosotros()
        }
    }

    private fun sumarValeCuatroEllos() {
        if (isPuntajeEllosMenorATreinta()) {
            puntajeEllos += 4
            cambiarScoreEllos()
        }
    }

    private fun sumarValeCuatroNosotros() {
        if (isPuntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 4
            cambiarScoreNosotros()
        }
    }

    private fun cambiarScoreEllos() {
        if (puntajeEllos >= 30) {
            puntajeEllos = 30
            AlertDialog.Builder(this)
                    .setTitle("Fin de la partida")
                    .setNeutralButton("Ok") { dialogInterface, _ ->
                        puntajeEllos = 0
                        puntajeNosotros = 0
                        cambiarScoreEllos()
                        cambiarScoreNosotros()
                        dialogInterface.dismiss()
                    }
                    .setMessage("Ganaron ELLES \n (se va a caer)")
                    .show()
        }
        score_ellos.text = puntajeEllos.toString()
    }

    private fun cambiarScoreNosotros() {
        if (puntajeNosotros >= 30) {
            puntajeNosotros = 30
            AlertDialog.Builder(this)
                    .setTitle("Fin de la partida")
                    .setNeutralButton("Ok") { dialogInterface, _ ->
                        puntajeEllos = 0
                        puntajeNosotros = 0
                        cambiarScoreEllos()
                        cambiarScoreNosotros()
                        dialogInterface.dismiss()
                    }
                    .setMessage("Ganamos NOSOTRES \n (se va a caer)")
                    .show()
        }
        score_nosotros.text = puntajeNosotros.toString()
    }

    private fun isPuntajeEllosMayorACero(): Boolean {
        return puntajeEllos > 0
    }

    private fun isPuntajeNosotrosMayorACero(): Boolean {
        return puntajeNosotros > 0
    }

    private fun isPuntajeEllosMenorATreinta(): Boolean {
        return puntajeEllos < 30
    }

    private fun isPuntajeNosotrosMenorATreinta(): Boolean {
        return puntajeNosotros < 30
    }

    private fun resetearPuntaje() {
        AlertDialog.Builder(this)
                .setTitle("Cuidado")
                .setPositiveButton("Si") { dialogInterface, _ ->
                    puntajeEllos = 0
                    puntajeNosotros = 0
                    cambiarScoreEllos()
                    cambiarScoreNosotros()
                    dialogInterface.dismiss()
                }
                .setNegativeButton("No") { dialogInterface, _ -> dialogInterface.dismiss() }
                .setMessage("Está seguro que desea borrar el puntaje y empezar nuevamente?")
                .show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}