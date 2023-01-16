package com.willi_vstn.vaccines_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    //1 AdapterView: RecyclerView
    RecyclerView recyclerView;

    //2 - Data source:
    VaccineModel[] myListData;

    //3 - Adapter
    Adapter_class adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        myListData = new VaccineModel[]{
                new VaccineModel("Hepatitis B Vaccine", R.drawable.vaccine_1),
                new VaccineModel("Tetanus Vaccine", R.drawable.vaccine_2),
                new VaccineModel("Covid-19 Vaccine", R.drawable.covid),
                new VaccineModel("Mumps Vaccine", R.drawable.vaccine_3),
                new VaccineModel("Cholera Vaccine", R.drawable.vaccine_4),
                new VaccineModel("Measles Vaccine", R.drawable.vaccine_5),
                new VaccineModel("Rotavirus Vaccine", R.drawable.vaccine_6)
        };


        //Adapter
        adapter = new Adapter_class(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

        //Handling the click events
        adapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(this,
                "Vaccine name: "+myListData[pos].getTitle(), Toast.LENGTH_SHORT).show();
    }
}