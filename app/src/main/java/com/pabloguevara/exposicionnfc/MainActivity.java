package com.pabloguevara.exposicionnfc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.v1tor.nuno.projectoiii.base.NFCActivity;

public class MainActivity extends NFCActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onTagDiscovered(Context context, Intent intent) {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
        Toast.makeText(this,"Tag leído", Toast.LENGTH_LONG).show();
        super.onTagDiscovered(context, intent);
    }
}

