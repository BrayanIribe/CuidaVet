package com.proyecto.cuidavet.ui.avisoprivacidad

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.proyecto.cuidavet.R
import com.proyecto.cuidavet.calendario
import com.proyecto.cuidavet.databinding.FragmentPrivacidadBinding
import com.proyecto.cuidavet.menu_desplegable

class AvisoFragment: Fragment() {

    private var _binding: FragmentPrivacidadBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bin = FragmentPrivacidadBinding.inflate(layoutInflater)

        bin.btnHecho.setOnClickListener {
            val intent = Intent(this@AvisoFragment.requireContext(), menu_desplegable::class.java)
            startActivity(intent)
        }

        return bin.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}