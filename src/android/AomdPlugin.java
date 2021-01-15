package com.aomd.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;

public class AomdPlugin extends CordovaPlugin {

	// 对应 cordova js
	@Override
	public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {

		if(action.equals("test")){
      // 第0个参数
			callbackContext.success(args.getString(0));
		}else {
			callbackContext.error(args.getString(0));
			return false;
		}
		return  true;
	}
	

}