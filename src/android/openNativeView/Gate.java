package com.doves.plugins.openNativeView;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;



public class Gate extends CordovaPlugin {

  public boolean execute(String action, org.json.JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if (action.equals("open")) {
      this.openActivity(args, callbackContext);
      return true;
    }
    return false;  // Returning false results in a "MethodNotFound" error.
  }



  private void openActivity(org.json.JSONArray args, final CallbackContext callbackcontext) {
    try {

      Context myContext = cordova.getActivity();
      String androidClass = args.getString(0);
      Intent intent = new Intent(myContext, Class.forName(androidClass));
      intent.putExtra("params1",args.getString(2));
      intent.putExtra("params2",args.getString(3));
      intent.putExtra("params3",args.getString(4));
      intent.putExtra("params4",args.getString(5));
      intent.putExtra("params5",args.getString(6));

      myContext.startActivity(intent);
;
      callbackcontext.success("取消发送成功");
    } catch (Exception e) {
      callbackcontext.error("发送失败");
      Log.e("TTGH", "send message fail , e=" + e.getMessage());
    }
  }

}
