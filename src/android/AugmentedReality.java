package com.ofss.fcdb.mobile.plugins.augmentedreality;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.AlertDialog;

public class AugmentedReality extends CordovaPlugin {
	
	public static final String INVOKE_PHONE = "invokePhone";
	
	public static final String INVOKE_TABLET = "invokeTablet";
	
	@Override
	public boolean execute(
							String action
						, 	JSONArray args
						,	CallbackContext callbackContext) 
			throws JSONException {

		if(INVOKE_PHONE.equals(action)){
			
			JSONObject map = new JSONObject();
			map.put("key1", "value1");
			map.put("key2", "value2");
			
			new AlertDialog.Builder(this.cordova.getActivity())
				.setMessage("Inside plugin")
				.show();
			
			callbackContext.success(map);
			return true;
		}else{
			callbackContext.error("Error in plugin");
			return false;
		}
	}

}
