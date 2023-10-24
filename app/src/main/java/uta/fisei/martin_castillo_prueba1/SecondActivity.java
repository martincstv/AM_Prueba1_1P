package uta.fisei.martin_castillo_prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText editTextNombre;
    private EditText editTextApellido;
    private TextView textViewDividendo2;
    private TextView textViewDivisor2;
    private TextView textViewNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextNombre = findViewById(R.id.editTextTextNombre2);
        editTextApellido = findViewById(R.id.editTextTextApellido2);
        textViewDividendo2 = findViewById(R.id.textViewDividendo2);
        textViewDivisor2 = findViewById(R.id.textViewDivisor2);
        textViewNumero2 = findViewById(R.id.textViewNumero2);

        Bundle bundle = getIntent().getExtras();
        int dividendo = Integer.parseInt(bundle.getString("dividendok"));
        int divisor = Integer.parseInt(bundle.getString("divisork"));
        int numero = Integer.parseInt(bundle.getString("numerok"));

        textViewDividendo2.setText(dividendo);
        textViewDivisor2.setText(divisor);
        textViewNumero2.setText(numero);
    }

    public void onClickThirdActivity(View view){
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("nombrek",editTextNombre.getText().toString());
        intent.putExtra("apellidok",editTextApellido.getText().toString());
        startActivity(intent);
    }
}