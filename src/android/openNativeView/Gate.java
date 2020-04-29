package com.doves.plugins.openNativeView;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.ccb.companybank.CCBMainActivity;
import com.ccb.companybank.CcbWebViewActivity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;



public class Gate extends CordovaPlugin {

  public boolean execute(String action, org.json.JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if (action.equals("open")) {
      String type = args.getString(0);
      String url = args.getString(1);
      this.openActivity(type, url, callbackContext);
      return true;
    }
    return false;  // Returning false results in a "MethodNotFound" error.
  }



  private void openActivity(String type, String url, final CallbackContext callbackcontext) {
    try {

      Context myContext = cordova.getActivity();
      Intent intent = new Intent(myContext, CCBMainActivity.class);
      intent.putExtra("url",url);
      myContext.startActivity(intent);
;
      callbackcontext.success("取消发送成功");
    } catch (Exception e) {
      callbackcontext.error("发送失败");
      Log.e("TTGH", "send message fail , e=" + e.getMessage());
    }
  }

}
