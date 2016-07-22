package ca.kgb.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentServiceTAG_";

    public MyIntentService() {
        super("MyIntentService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent: " + Thread.currentThread());
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + Thread.currentThread());
    }

}
