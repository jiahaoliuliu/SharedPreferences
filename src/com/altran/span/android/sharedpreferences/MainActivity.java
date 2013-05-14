package com.altran.span.android.sharedpreferences;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private static final String LOG_TAG = MainActivity.class.getSimpleName();
	private Button subirVolumen;
	private Button bajarVolumen;
	private EditText volumenActualET;
	// Contiene el volumen actual
	private int volumenActual;

	private Button subirCanal;
	private Button bajarCanal;
	private EditText canalActualET;
	// Contiene el canal actual
	private int canalActual;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subirVolumen = (Button)findViewById(R.id.subirVolumen);
        subirVolumen.setOnClickListener(onClickListener);

        bajarVolumen = (Button)findViewById(R.id.bajarVolumen);
        bajarVolumen.setOnClickListener(onClickListener);

        volumenActualET = (EditText)findViewById(R.id.volumenActual);
        volumenActual = Integer.parseInt(volumenActualET.getText().toString());
        Log.v(LOG_TAG, "El volumen actual es "+ volumenActual);

        subirCanal = (Button)findViewById(R.id.subirCanal);
        subirCanal.setOnClickListener(onClickListener);

        bajarCanal = (Button)findViewById(R.id.bajarCanal);
        bajarCanal.setOnClickListener(onClickListener);

        canalActualET = (EditText)findViewById(R.id.canalActual);
        canalActual = Integer.parseInt(canalActualET.getText().toString());
        Log.v(LOG_TAG, "El canal actual es " + canalActual);
	}

	View.OnClickListener onClickListener = new View.OnClickListener() {
        
        @Override
        public void onClick(View v) {
            switch(v.getId()){
            case (R.id.subirVolumen):
            	Log.v(LOG_TAG, "Subiendo el volumen");
            	// Sumar 1 al volumen actual
            	// Actualizar el volumen actual (Edit Text)
            	// Guardar los cambios en el Shared Preferences
                break;
            case (R.id.bajarVolumen):
            	Log.v(LOG_TAG, "Bajando el volumen");
            	// Comprobar que el volumen actual no sea 0
            	// Si no es así, bajar 1 al volumen actual
            	// Actualizar el volumen actual (Edit Text)
            	// Guardar los cambios en el Shared Preferences
                break;
            case (R.id.subirCanal):
            	Log.v(LOG_TAG, "Subiendo el canal");
            	// Lo mismo que subirVolumen, pero para canales
                break;
            case (R.id.bajarCanal):
            	Log.v(LOG_TAG, "Bajando el canal");
            	// Lo mismo que bajarVolumen, pero para canales 
                break;
            default:
                Log.e(LOG_TAG, "Button " + v.getId() + " not recognized");
                break;
            }
        }
    };

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
