package uta.fisei.martin_castillo_prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonMostrarResultados;
    private TextView textViewNombre;
    private TextView textViewApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        buttonMostrarResultados = findViewById(R.id.buttonMostrarResultados1);
        textViewNombre = findViewById(R.id.textViewNombre);
        textViewApellido = findViewById(R.id.textViewApellido);
        if (bundle != null) {
            buttonMostrarResultados.setEnabled(true);
            String nombre = bundle.getString("nombrek");
            String apellido = bundle.getString("apellidok");
            textViewNombre.setText(nombre);
            textViewApellido.setText(apellido);
        }

    }

    public void onClickSecondActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }


}