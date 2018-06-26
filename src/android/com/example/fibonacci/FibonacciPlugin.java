package com.example.fibonacci;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

public class FibonacciPlugin extends CordovaPlugin {

  private FibonacciPluginKt plugin = new FibonacciPluginKt();

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
    plugin.initialize(cordova, webView);
  }

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws
    JSONException {
    return plugin.execute(action, args, callbackContext);
  }
}
