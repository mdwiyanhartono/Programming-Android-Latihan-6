package dwiyanhartono.com.latihan6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    TextView Hasil;
    private int Alas;
    private int Tinggi;
    private double Luas;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Hasil = findViewById(R.id.Hasil);
        Intent In = getIntent();
        Alas = In.getExtras().getInt("ALAS",0);
        Tinggi = In.getExtras().getInt("TINGGI",0);
        Hitung_Luas();
        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void Hitung_Luas(){
        Luas = (Alas * Tinggi) * 0.5;
        DecimalFormat precision = new DecimalFormat("0.00");
        Hasil.setText( precision.format(Luas));
    }
}