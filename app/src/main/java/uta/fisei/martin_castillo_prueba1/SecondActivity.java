package uta.fisei.martin_castillo_prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText editTextNombre;
    private EditText editTextApellido;
    private TextView textViewDividendo2;
    private TextView textViewDivisor2;
    private TextView textViewNumero2;
    private Button buttonCerrar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        editTextNombre = findViewById(R.id.editTextTextNombre2);
        editTextApellido = findViewById(R.id.editTextTextApellido2);
        textViewDividendo2 = findViewById(R.id.textViewDividendo2);
        textViewDivisor2 = findViewById(R.id.textViewDivisor2);
        textViewNumero2 = findViewById(R.id.textViewNumero2);
        buttonCerrar2 = findViewById(R.id.buttonCerrar2);
        if (bundle != null) {
            buttonCerrar2.setEnabled(true);
            String nombre = bundle.getString("nombrek");
            String apellido = bundle.getString("apellidok");
            String dividendo = bundle.getString("dividendok");
            String divisor = bundle.getString("divisork");
            String numero = bundle.getString("numerok");

            editTextNombre.setText(nombre);
            editTextApellido.setText(apellido);
            textViewDividendo2.setText(dividendo);
            textViewDivisor2.setText(divisor);
            textViewNumero2.setText(numero);
        }

    }


    public void onClickThirdActivity(View view){
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("nombrek",editTextNombre.getText().toString());
        intent.putExtra("apellidok",editTextApellido.getText().toString());
        startActivity(intent);
    }

    public void onClickMainActivity(View view){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("nombrek",editTextNombre.getText().toString());
        intent.putExtra("apellidok",editTextApellido.getText().toString());
        startActivity(intent);
    }


}