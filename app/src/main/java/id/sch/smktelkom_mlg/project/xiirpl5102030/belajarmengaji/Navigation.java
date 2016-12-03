package id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji.adapter.adapterr;
import id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji.model.modyel;

public class Navigation extends AppCompatActivity {

    ArrayList<modyel> mList = new ArrayList<>();
    adapterr mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new adapterr(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        for (int i = 1; i <= 30; i++) {
            mList.add(new modyel("Halaman " + i));
        }
    }
}
