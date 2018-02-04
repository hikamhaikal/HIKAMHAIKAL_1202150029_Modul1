package id.simplify.hikamhaikal_1202150029_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView tpt,nm,jml,ttl;
    String nama1,jumlah1,tempat1,harga1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tpt=(TextView) findViewById(R.id.tempat);
        nm=(TextView) findViewById(R.id.makanan);
        jml=(TextView) findViewById(R.id.jumlah);
        ttl=(TextView) findViewById(R.id.total);

        nama1 = getIntent().getStringExtra("nama");
        jumlah1 = getIntent().getStringExtra("jumlah");
        tempat1 = getIntent().getStringExtra("tempat");
        harga1 = getIntent().getStringExtra("harga");


        tpt.setText(tempat1);
        nm.setText(nama1);
        jml.setText(jumlah1);
        ttl.setText(String.valueOf(Integer.parseInt(harga1)*Integer.parseInt(jumlah1)));



    }

    @Override
    protected void onStart() {
        super.onStart();
        if (Integer.parseInt(ttl.getText().toString())>65500){Toast.makeText(this,"Maaf, uang anda tidak cukup untuk makan di sini",Toast.LENGTH_LONG).show();}
        else {Toast.makeText(this,"Yeay! Uang anda cukup untuk makan di sini",Toast.LENGTH_LONG).show();}
    }
}
