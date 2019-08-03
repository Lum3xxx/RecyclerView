package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvHome;
    private ArrayList<String> listaRV = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHome = findViewById(R.id.rvHome);
        llenarData();
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        Adapter adapter = new Adapter(listaRV);
        Log.d("asdsva", "onCreate: lista size : "+listaRV.size());
        rvHome.setLayoutManager(manager);
        rvHome.setAdapter(adapter);
    }

    private void llenarData() {
        listaRV.add("Ella no te quiere");
        listaRV.add("Segundo Elemento");
        listaRV.add("Tercero Elemento");
        listaRV.add("Cuarto Elemento");
        listaRV.add("Quinto Elemento");
    }
}