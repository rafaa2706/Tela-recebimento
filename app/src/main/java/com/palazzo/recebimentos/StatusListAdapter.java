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

import java.util.ArrayList;

public class StatusListAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<Status> status;

    public StatusListAdapter(Context context, ArrayList<Status> status) {
        this.context = context;
        this.status = status;
    }

    @Override
    public int getCount() {
        return status.size();
    }

    @Override
    public Object getItem(int position) {
        return status.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_status, parent, false);

        }

        TextView name = convertView.findViewById(R.id.textViewArea);
        name.setText(status.get(position).getArea());

        TextView lote = convertView.findViewById(R.id.textViewVolumePorcentagem);
        lote.setText(String.valueOf(status.get(position).getPorcentagem()));






        return convertView;
    }
}
