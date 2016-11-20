package id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji.adapter.adapterr;
import id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji.model.modyel;

public class IqroPage extends AppCompatActivity {

    ArrayList<modyel> mList = new ArrayList<>();
    adapterr mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.btniq1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IqroPage.this, Iqro1.class));
            }

        });

        findViewById(R.id.btniq2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IqroPage.this, Iqro2.class));
            }

        });

        findViewById(R.id.btniq3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IqroPage.this, Iqro3.class));
            }

        });

        findViewById(R.id.btniq4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IqroPage.this, Iqro4.class));
            }

        });

        findViewById(R.id.btniq5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IqroPage.this, Iqro5.class));
            }

        });

        findViewById(R.id.btniq6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IqroPage.this, Iqro6.class));
            }

        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}