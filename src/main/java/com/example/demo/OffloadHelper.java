package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;

public class OffloadHelper {

    String offload_format(JSONObject json) throws JSONException {
        json.put("device","local");

        return "";

    }

}
