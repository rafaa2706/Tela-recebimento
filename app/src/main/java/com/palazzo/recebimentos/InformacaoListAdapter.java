package com.palazzo.recebimentos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.palazzo.tela_recebimentos.R;

import java.util.ArrayList;

public class InformacaoListAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<Informacao> informacao;

    public InformacaoListAdapter(Context context, ArrayList<Informacao> informacao) {
        this.context = context;
        this.informacao = informacao;
    }

    @Override
    public int getCount() {
        return informacao.size();
    }

    @Override
    public Object getItem(int position) {
        return informacao.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_informacao, parent, false);

            TextView fornecedor = convertView.findViewById(R.id.textViewFornecedor);
            fornecedor.setText(informacao.get(position).getFornecedor());

            TextView lote = convertView.findViewById(R.id.textViewLoteInformacao);
            lote.setText(String.valueOf(informacao.get(position).getLote()));

            TextView dataEntrega = convertView.findViewById(R.id.textViewDataEntrega);
            dataEntrega.setText(String.valueOf(informacao.get(position).getDataEntrega()));

            TextView status = convertView.findViewById(R.id.textViewStatusInformacao);
            status.setText(String.valueOf(informacao.get(position).getStatus()));

        }

        return convertView;
    }
}
