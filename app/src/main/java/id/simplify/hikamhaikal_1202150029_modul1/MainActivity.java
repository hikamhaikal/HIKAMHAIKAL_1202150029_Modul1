package id.simplify.hikamhaikal_1202150029_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText nama1, jumlah;
    Button EB,AN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama1 = (EditText) findViewById(R.id.editText2);
        jumlah = (EditText) findViewById(R.id.editText3);
        EB = (Button) findViewById(R.id.eatbusbutton);
        AN = (Button) findViewById(R.id.abnormalbutton);

    }


    public void showeatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("nama", String.valueOf(nama1.getText().toString()));
        intent.putExtra("jumlah",String.valueOf(jumlah.getText().toString()));
        intent.putExtra("harga","50000");
        intent.putExtra("tempat","EATBUS");
        startActivity(intent);


    }

    public void showabnormal(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("nama", String.valueOf(nama1.getText().toString()));
        intent.putExtra("jumlah",String.valueOf(jumlah.getText().toString()));
        intent.putExtra("harga","30000");
        intent.putExtra("tempat","ABNORMAL");
        startActivity(intent);

    }
}
