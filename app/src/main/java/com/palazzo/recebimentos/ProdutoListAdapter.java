package com.palazzo.recebimentos;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.palazzo.tela_recebimentos.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProdutoListAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<Produto> produtos;

    public ProdutoListAdapter(Context context, ArrayList<Produto> produtos) {
        this.context = context;
        this.produtos = produtos;
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int i) {
        return produtos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.list_produtos, viewGroup, false);

        }

        TextView cod = view.findViewById(R.id.textViewCod);
        cod.setText(produtos.get(i).getCodigo());

        TextView name = view.findViewById(R.id.textViewName);
        name.setText(produtos.get(i).getName());

        TextView lote = view.findViewById(R.id.textViewLote);
        lote.setText(String.valueOf(produtos.get(i).getLote()));

        TextView qtd = view.findViewById(R.id.textViewQtd);
        qtd.setText(String.valueOf(produtos.get(i).getQtd()));

        ImageView imageView = view.findViewById(R.id.ImageViewItem);

        // Obtenha a parte da string base64 após "data:image/jpeg;base64," ou "data:image/png;base64," etc.
        String base64Image = produtos.get(i).getImagemUrl().substring(produtos.get(i).getImagemUrl().indexOf(",") + 1);

        // Decodifique a string base64 em um array de bytes
        byte[] imageBytes = Base64.decode(base64Image, Base64.DEFAULT);

        // Crie um bitmap a partir do array de bytes
        Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
        imageView.setImageBitmap(bitmap);

        return view;
    }
}
