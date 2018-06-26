package com.example.fibonacci

import android.util.Log
import org.apache.cordova.*
import org.json.JSONArray
import java.util.*

class FibonacciPlugin : CordovaPlugin() {

  val TAG: String = "FibonacciPlugin";

  override fun initialize(cordova: CordovaInterface?, webView: CordovaWebView?) {
    super.initialize(cordova, webView)

    Log.d(TAG, "Initializing FibonacciPlugin in Kotlin")
  }

  private fun echo(phrase: String?) {
    Log.d(TAG, phrase);
  }

  private fun getDate(callbackContext: CallbackContext?) {
    val result = PluginResult(PluginResult.Status.OK, Date().toString())
    callbackContext?.sendPluginResult(result);
  }

  override fun execute(action: String?, args: JSONArray?, callbackContext: CallbackContext?): Boolean {
    when (action) {
      "echo" -> this.echo(args?.getString(0))
      "getDate" -> this.getDate(callbackContext)
      else -> return false;
    }
    return true;
  }
}
