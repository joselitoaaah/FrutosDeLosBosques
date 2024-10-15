package cl.virginiogomez.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Button btnVolver = findViewById(R.id.button);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



        EditText etNombre = findViewById(R.id.etNombre);
        EditText etTelefono = findViewById(R.id.etTelefono);
        EditText etEmail = findViewById(R.id.etEmail);


        Button btnGuardarCliente = findViewById(R.id.btnGuardarCliente);

        btnGuardarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                String telefono = etTelefono.getText().toString();
                String email = etEmail.getText().toString();

                Toast.makeText(MainActivity2.this, "", Toast.LENGTH_SHORT).show();.(MainActivity.this,
                        "Nombre: " + nombre + "\nTeléfono: " + telefono + "\nEmail: " + email,
                        Toast.LENGTH_LONG).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}