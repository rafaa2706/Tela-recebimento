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
import com.squareup.picasso.Transformation;

import java.util.ArrayList;

public class MaterialListAdapter extends BaseAdapter implements Transformation {

    private Context context;

    private ArrayList<MaterialArmazenado> materialArmazenados;

    public MaterialListAdapter(Context context, ArrayList<MaterialArmazenado> materialArmazenados) {
        this.context = context;
        this.materialArmazenados = materialArmazenados;
    }

    @Override
    public int getCount() {
        return materialArmazenados.size();
    }

    @Override
    public Object getItem(int i) {
        return materialArmazenados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_material, parent, false);

        }

        TextView name = convertView.findViewById(R.id.textViewNameMaterial);
        name.setText(materialArmazenados.get(position).getName());

        TextView lote = convertView.findViewById(R.id.textViewEstoque);
        lote.setText(String.valueOf(materialArmazenados.get(position).getEstoque()));

        TextView qtd = convertView.findViewById(R.id.textViewPorcentagem);
        qtd.setText(String.valueOf(materialArmazenados.get(position).getPorcentagem()));

        ImageView imageView = convertView.findViewById(R.id.imageViewItem);

        String base64Image = materialArmazenados.get(position).getImagemUrl().substring(materialArmazenados.get(position).getImagemUrl().indexOf(",") + 1);
        byte[] imageBytes = Base64.decode(base64Image, Base64.DEFAULT);

        Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
        imageView.setImageBitmap(bitmap);


        return convertView;


    }

    @Override public Bitmap transform(Bitmap source) {
        int size = Math.min(source.getWidth(), source.getHeight());
        int x = (source.getWidth() - size) / 2;
        int y = (source.getHeight() - size) / 2;
        Bitmap result = Bitmap.createBitmap(source, x, y, size, size);
        if (result != source) {
            source.recycle();
        }
        return result;

    }

    @Override
    public String key() {
        return null;
    }

}
