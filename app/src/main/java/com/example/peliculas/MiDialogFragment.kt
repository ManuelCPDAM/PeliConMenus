package com.example.peliculas

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MiDialogFragment: DialogFragment()  {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Salir"
            val content = "¿Está seguro de que desa salir?"
            val builder: AlertDialog.Builder= AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(android.R.string.ok)  {dialog, which ->
                    //Callback para el ok
                    Toast.makeText(requireActivity().applicationContext, "Esta saliendo de la aplicación",
                        Toast.LENGTH_LONG).show()
                }
                .setNegativeButton(android.R.string.cancel) {dialog, which ->
                    //Callback para el Cancel
                    Toast.makeText(requireActivity().applicationContext, "Ha cancelado salir de la aplicación",
                        Toast.LENGTH_LONG).show()
                }
            //Devuelve un AlertDialog
            //tal y como lo hemos definido en el builder
            return builder.create()} ?: throw IllegalStateException("El fragmento no está asociado a ninguna actividad")
    }
}