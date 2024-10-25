package com.palazzo.recebimentos;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class FireBaseEnderecamento {

//    private static final String TABELA_NOME = "/informacoesdosprodutos";
//    private Activity activity;
//
//    private ListView listViewMaterialArmazenado;
//    private ArrayAdapter<MaterialArmazenado> adapter;
//    private ArrayList<MaterialArmazenado> materialArmazenados;
//
//    private ListView listViewStatus;
//    private ArrayAdapter<Status> adapterMaterial;
//    private ArrayList<Status> status;
//
//    public FireBaseEnderecamento(Activity activity, ListView listViewMaterialArmazenado, ArrayAdapter<MaterialArmazenado> adapter, ArrayList<MaterialArmazenado> materialArmazenados, ListView listViewStatus, ArrayAdapter<Status> adapterMaterial, ArrayList<Status> status) {
//        this.activity = activity;
//        this.listViewMaterialArmazenado = listViewMaterialArmazenado;
//        this.adapter = adapter;
//        this.materialArmazenados = materialArmazenados;
//        this.listViewStatus = listViewStatus;
//        this.adapterMaterial = adapterMaterial;
//        this.status = status;
//    }
//
//    public void buscaMaterialArmazenados(){
//        materialArmazenados = new ArrayList<>();
//
//        FirebaseFirestore.getInstance().collection(TABELA_NOME).addSnapshotListener((value, error) -> {
//            List<DocumentChange> dcs = value.getDocumentChanges();
//
//            for (DocumentChange doc: dcs){
//                if (doc.getType() == DocumentChange.Type.ADDED){
//                    MaterialArmazenado m = doc.getDocument().toObject(MaterialArmazenado.class);
//                    materialArmazenados.add(m);
//                }
//            }
//
//            adapter = new ArrayAdapter<>(
//                    activity.getApplicationContext(),
//                    android.R.layout.simple_list_item_1,
//                    materialArmazenados
//            );
//
//            MaterialListAdapter adapter = new MaterialListAdapter(activity, materialArmazenados);
//            listViewMaterialArmazenado.setAdapter(adapter);
//        });
//    }


}
