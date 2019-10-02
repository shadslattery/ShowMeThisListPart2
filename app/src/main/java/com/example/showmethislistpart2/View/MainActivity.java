package com.example.showmethislistpart2.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.showmethislistpart2.R;
import com.example.showmethislistpart2.SMTPart2.SMTLP_Adopter;
import com.example.showmethislistpart2.Utils;

public class MainActivity extends AppCompatActivity {
        private RecyclerView rvPeople;
        private SMTLP_Adopter SMTLP_Adopter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPeople = findViewById(R.id.rvpeople);

        // Finish setting up recyclerview
        rvPeople.setLayoutManager(new LinearLayoutManager(this));
        rvPeople.setHasFixedSize(true);

        // Init people adapter
        SMTLP_Adopter = new SMTLP_Adopter(Utils.get());
        rvPeople.setAdapter(SMTLP_Adopter);

    }
}
