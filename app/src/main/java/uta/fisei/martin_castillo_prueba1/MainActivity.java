package uta.fisei.martin_castillo_prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonMostrarResultados;
    private TextView textViewNumeroInvertido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMostrarResultados = findViewById(R.id.buttonMostrarResultados1);
        buttonMostrarResultados.setEnabled(true);
    }

    public void onClickSecondActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }


}