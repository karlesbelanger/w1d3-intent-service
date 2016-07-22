package ca.kgb.intentservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //private static
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("TAG_", "onCreate: " + Thread.currentThread());
    }

    public void triggerStartedService(View view) {
        Intent intent = new Intent(this, MyStartedService.class);
        startService(intent);
    }
    public void triggerIntentService(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }
}
