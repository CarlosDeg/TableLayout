package appcom.example.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView nombre = (TextView) findViewById(R.id.nombre);
        final TextView edad = (TextView) findViewById(R.id.edad);
        final TextView email = (TextView) findViewById(R.id.email);
        final TextView tel = (TextView) findViewById(R.id.tel);
        //textView = findViewById(R.id.texto);
        Button button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TableLayout lista = (TableLayout)findViewById(R.id.lista);
                String [] cadena = {nombre.getText().toString(),edad.getText().toString(),email.getText().toString(),tel.getText().toString()};
                TableRow row = new TableRow(getApplicationContext());
                TextView textView;

                for (int i=0; i<4 ;i++)
                {
                    textView=new TextView(getBaseContext());

                    textView.setGravity(Gravity.CENTER_VERTICAL);

                    textView.setPadding(15,15,15,15);
                    //textView.setBackgroundResource(R.color.WHITE);
                    textView.setText(cadena[i]);
                    textView.setTextColor(Color.BLACK);
                    row.addView(textView);



                }
                lista.addView(row);

            }
        });


    }
}