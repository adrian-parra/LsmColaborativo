package com.example.lsmcolaborativoloal.ui.agregar_usuario;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.lsmcolaborativoloal.R;

public class AgregarUsuario extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_agregar_usuario, container, false);

        return root;


    }

}
