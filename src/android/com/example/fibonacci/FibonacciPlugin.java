package com.example.fibonacci;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import java.util.Date;
import android.util.Log;

public class FibonacciPlugin extends CordovaPlugin {
    private static final String TAG = "FibonacciPlugin";

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        Log.d(TAG, "Initializing FibonacciPlugin");
    }

    private void echo(String phrase) {
        Log.d(TAG, phrase);
    }

    private void getDate(final CallbackContext callbackContext) {
        final PluginResult result = new PluginResult(PluginResult.Status.OK, (new Date()).toString());
        callbackContext.sendPluginResult(result);
    }

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        switch (action) {
        case "echo":
            this.echo(args.getString(0));
            break;
        case "getDate":
            this.getDate(callbackContext);
            break;
            default: return false;
        }
    }
}