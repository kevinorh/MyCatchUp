package pe.edu.upc.kevin.mycatchup;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by KEVIN on 25/04/2018.
 */

public class MyCatchUpApp extends Application{


    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
    }
}
