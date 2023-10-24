package uta.fisei.martin_castillo_prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button buttonMostrarResultados;
    private TextView textViewNombre;
    private TextView textViewApellido;
    private TextView textViewDividendo;
    private TextView textViewDivisor;
    private TextView textViewNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        buttonMostrarResultados = findViewById(R.id.buttonMostrarResultados1);
        textViewNombre = findViewById(R.id.textViewNombre);
        textViewApellido = findViewById(R.id.textViewApellido);
        textViewDividendo = findViewById(R.id.textViewDividendo);
        textViewDivisor = findViewById(R.id.textViewDivisor);
        textViewNumero = findViewById(R.id.textViewNumeroInvertido);
        if (bundle != null) {
            buttonMostrarResultados.setEnabled(true);
            String nombre = bundle.getString("nombrek");
            String apellido = bundle.getString("apellidok");
            String dividendo = bundle.getString("dividendok");
            String divisor = bundle.getString("divisork");
            String numero = bundle.getString("numerok");

          

            textViewNombre.setText("Nombre: ".concat(nombre));
            textViewApellido.setText("Apellido: ".concat(apellido));
            textViewDividendo.setText("Dividendo: ".concat(dividendo));
            textViewDivisor.setText("Divisor: ".concat(divisor));
            textViewNumero.setText("Numero invertido: ".concat(numero));
        }
    }




    public void onClickSecondActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }


}