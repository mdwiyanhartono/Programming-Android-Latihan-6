package dwiyanhartono.com.latihan6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1 ,et2;
    Button btnhitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.ET1);
        et2 = findViewById(R.id.ET2);
        btnhitung = findViewById(R.id.button_Main_Submit);
        HitungSegitiga();
    }

    private void HitungSegitiga(){
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer Alas = Integer.parseInt(et1.getText().toString());
                Integer Tinggi = Integer.parseInt(et2.getText().toString());
                Intent In = new Intent(MainActivity.this,MainActivity2.class);
                In.putExtra("ALAS",Alas);
                In.putExtra("TINGGI",Tinggi);
                startActivity(In);
                finish();
            }
        });
    }
}