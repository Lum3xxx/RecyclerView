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
        listaRV.add("Ella si te quiere");
        listaRV.add("Mentira mrd");
        listaRV.add("distinguida dama ctm");
        listaRV.add("Cuarto Elemento");
        listaRV.add("Quinto Elemento");
    }
}