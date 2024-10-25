package com.palazzo.recebimentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ListViewCompat;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.palazzo.tela_recebimentos.R;

import java.util.ArrayList;

public class EnderecamentoActivity extends AppCompatActivity {

    private ListView listaStatus;

    private ListView listaMaterial;

    private StatusListAdapter statusListAdapter;

    private MaterialListAdapter materialListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enderecamento);

        listaStatus = findViewById(R.id.listViewStatus);

        listaMaterial = findViewById(R.id.listViewMaterial);


        String url = "data:image/jpeg;base64,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";

        ArrayList<Status> status = new ArrayList<>();
        Status teste1 = new Status("Area 1", 0.41);

        status.add(teste1);

        ArrayList<MaterialArmazenado> materialArmazenados = new ArrayList<>();
        MaterialArmazenado teste2 = new MaterialArmazenado("Uva Roxa", 625, 0.10, url);

        materialArmazenados.add(teste2);

        statusListAdapter = new StatusListAdapter(this, status);

        materialListAdapter = new MaterialListAdapter(this, materialArmazenados);

        listaStatus.setAdapter(statusListAdapter);
        listaMaterial.setAdapter(materialListAdapter);



    }

}