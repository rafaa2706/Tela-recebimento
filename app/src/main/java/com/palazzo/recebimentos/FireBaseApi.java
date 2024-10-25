package com.palazzo.recebimentos;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FireBaseApi {

    private static final String TABELA_NOME = "/produtosrecebidos";

    private Activity activity;
    private ListView listViewProdutos;
    private ArrayAdapter<Produto> adapter;
    private ArrayList<Produto> produtos;


    public FireBaseApi(Activity activity, ListView listViewProdutos, ArrayAdapter<Produto> adapter, ArrayList<Produto> produtos) {
        this.activity = activity;
        this.listViewProdutos = listViewProdutos;
        this.adapter = adapter;
        this.produtos = produtos;
    }

   public void buscaProdutos(){
       produtos = new ArrayList<>();

       FirebaseFirestore.getInstance().collection(TABELA_NOME).addSnapshotListener((value, error) -> {
            List<DocumentChange> dcs = value.getDocumentChanges();

            for (DocumentChange doc: dcs){
                if (doc.getType() == DocumentChange.Type.ADDED){
                    Produto p = doc.getDocument().toObject(Produto.class);
                    produtos.add(p);
                }
           }

            adapter = new ArrayAdapter<>(
                    activity.getApplicationContext(),
                    android.R.layout.simple_list_item_1,
                    produtos
            );

            ProdutoListAdapter adapter = new ProdutoListAdapter(activity, produtos);
           listViewProdutos.setAdapter(adapter);
        });



//       StorageReference storageRef = FirebaseStorage.getInstance().getReference();
//       StorageReference imageRef = storageRef.child("images/nome_da_imagem.jpg");
//
//       Uri file = Uri.fromFile(new File("caminho/para/a/imagem.jpg"));
//
//
//       imageRef.putFile(file)
//               .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//                   @Override
//                   public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                       // Imagem enviada com sucesso
//                       // Aqui você pode fazer algo, como obter a URL da imagem e salvá-la no banco de dados Firestore
//                   }
//               })
//               .addOnFailureListener(new OnFailureListener() {
//                   @Override
//                   public void onFailure(@NonNull Exception e) {
//                       // Ocorreu um erro ao enviar a imagem
//                   }
//               });
//
     }

//
//
    }
