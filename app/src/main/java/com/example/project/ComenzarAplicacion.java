package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class ComenzarAplicacion extends AppCompatActivity {

    int counter = 0;
    @Override
    public void onBackPressed() {
        if(counter == 0){
            Toast.makeText(this,"Press again to Exit",Toast.LENGTH_SHORT).show();
        }
        counter++;
        if(counter == 2) {
            super.onBackPressed();
            counter= 0;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.actividad_comenzaraplicacion);
    }

    public void to_sign(View view)
    {
        Intent intent = new Intent(ComenzarAplicacion.this, IniciarSesion.class);
        ComenzarAplicacion.this.finish();
        startActivity(intent);
    }
}