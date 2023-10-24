package uta.fisei.martin_castillo_prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView textViewNombre3;
    private TextView textViewApellido3;
    private EditText editTextDividendo;
    private EditText editTextDivisor;
    private EditText editTextNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Bundle bundle = getIntent().getExtras();

        textViewNombre3 = findViewById(R.id.textViewNombre3);
        textViewApellido3 = findViewById(R.id.textViewApellido3);
        editTextDividendo = findViewById(R.id.editTextTextDividendo3);
        editTextDivisor = findViewById(R.id.editTextTextDivisor3);
        editTextNumero = findViewById(R.id.editTextTextNumero3);

        String nombre = bundle.getString("nombrek");
        String apellido = bundle.getString("apellidok");

        textViewNombre3.setText(nombre);
        textViewApellido3.setText(apellido);
    }

    public void onClickSecondActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("dividendok",editTextDividendo.getText());
        intent.putExtra("divisork",editTextDivisor.getText());
        intent.putExtra("numerok",editTextNumero.getText());
        startActivity(intent);
    }
}