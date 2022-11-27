package com.example.peliculas

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get

open class ActivityWithMenus:AppCompatActivity() {
    companion object{
        var actividadActual=0;
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.menu_actividades,menu)
        if (menu != null) {
            for(i in 0 until menu.size()){
                if(i== actividadActual) menu.getItem(i).isEnabled=false
                else menu.getItem(i).isEnabled=true
            }
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.peli ->{
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                actividadActual=0;
                startActivity(intent)
                true
            }
            R.id.AnadirPeli ->{
                val intent = Intent(this,Editarpelicula::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                actividadActual=1;

                startActivity(intent)
                true
            }
            R.id.apps ->{

                val intent = Intent(this, Info::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual=2;
                startActivity(intent)
                true
            }
            R.id.salir->{
                val miDialogo = MiDialogFragment()
                miDialogo.show(supportFragmentManager,"MiDialogo")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}