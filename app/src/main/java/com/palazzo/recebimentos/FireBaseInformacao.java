package com.palazzo.recebimentos;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class FireBaseInformacao {

    private static final String TABELA_NOME = "/informacoesdosprodutos";

    private Activity activity;
    private ListView listViewInformacoes;
    private ArrayAdapter<Informacao> adapter;
    private ArrayList<Informacao> informacoes;

    public FireBaseInformacao(Activity activity, ListView listViewInformacoes, ArrayAdapter<Informacao> adapter, ArrayList<Informacao> informacoes) {
        this.activity = activity;
        this.listViewInformacoes = listViewInformacoes;
        this.adapter = adapter;
        this.informacoes = informacoes;
    }

    public void buscaProdutos(){
        informacoes = new ArrayList<>();

        FirebaseFirestore.getInstance().collection(TABELA_NOME).addSnapshotListener((value, error) -> {
            List<DocumentChange> dcs = value.getDocumentChanges();

            for (DocumentChange doc: dcs){
                if (doc.getType() == DocumentChange.Type.ADDED){
                    Informacao i = doc.getDocument().toObject(Informacao.class);
                    informacoes.add(i);
                }
            }

            adapter = new ArrayAdapter<>(
                    activity.getApplicationContext(),
                    android.R.layout.simple_list_item_1,
                    informacoes
            );

            InformacaoListAdapter adapter = new InformacaoListAdapter(activity, informacoes);
            listViewInformacoes.setAdapter(adapter);
        });
    }



}
