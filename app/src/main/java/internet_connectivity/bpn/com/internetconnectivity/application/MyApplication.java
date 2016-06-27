package internet_connectivity.bpn.com.internetconnectivity.application;

import android.app.Application;

import internet_connectivity.bpn.com.internetconnectivity.receiver.ConnectivityReceiver;

public class MyApplication extends Application {
 
    private static MyApplication mInstance;
 
    @Override
    public void onCreate() {
        super.onCreate();
 
        mInstance = this;
    }
 
    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
 
    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}