package com.example.showmethislistpart2.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.showmethislistpart2.R;
import com.example.showmethislistpart2.SMTPart2.SMTLP_Adaptor;
import com.example.showmethislistpart2.Utils;

public class MainActivity extends AppCompatActivity {

        private RecyclerView rv_People;
        private SMTLP_Adaptor recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_People = findViewById(R.id.rvpeople);

        // Finish setting up recyclerview
        rv_People.setLayoutManager(new LinearLayoutManager(this));
        rv_People.setHasFixedSize(true);

        // Init people adapter
        recyclerAdapter = new SMTLP_Adaptor(Utils.getList());
        rv_People.setAdapter(recyclerAdapter);

    }
}
