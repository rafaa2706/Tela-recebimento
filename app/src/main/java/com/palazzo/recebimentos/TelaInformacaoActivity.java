package com.palazzo.recebimentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.palazzo.tela_recebimentos.R;

import java.util.ArrayList;

public class TelaInformacaoActivity extends AppCompatActivity {

    private ListView listaInformacao;
    private InformacaoListAdapter informacaoListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_informacao);

        Toolbar toolbar = findViewById(R.id.toolbarInformacao);
        setSupportActionBar(toolbar);

        listaInformacao = findViewById(R.id.listViewInformacao);

        ArrayList<Informacao> informacao = new ArrayList<>();
        Informacao teste1 = new Informacao("AzGrap", 1050, "20/12/2023", true);

        informacao.add(teste1);

        informacaoListAdapter = new InformacaoListAdapter(this, informacao);

        listaInformacao.setAdapter(informacaoListAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_localizacao, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_localizar) {
            Intent intent = new Intent(this, EnderecamentoActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}