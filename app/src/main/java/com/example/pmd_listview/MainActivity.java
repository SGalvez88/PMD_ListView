package com.example.pmd_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listado = (ListView) findViewById(R.id.listado);
        final String [] datos = new String[]{
                "Sergio Galvez",
                "Jorge Vazquez",
                "Jhon Jairo",
                "Leonel Lopez",
                "Jaskaran Sing"
       };

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,datos);
        listado.setAdapter(adaptador);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
                String elemento = (String) adapterView.getAdapter().getItem(posicion);
                Toast.makeText(MainActivity.this,elemento,Toast.LENGTH_LONG).show();
            }
        });
    }
}