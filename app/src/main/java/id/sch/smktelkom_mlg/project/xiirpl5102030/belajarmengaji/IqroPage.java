package id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

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
