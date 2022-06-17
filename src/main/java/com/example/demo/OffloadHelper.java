package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;

public class OffloadHelper {

    JSONObject json;

    String offload_format(String func, String para) throws JSONException {

        switch(func){
            case "1":
                int para_int = Integer.parseInt(para);
                json = helperclass.function_metric(para_int);
                break;
            case "2":
                json = helperclass.function_metric_add_million();
                break;

            default:
                return "error";
        }
        json.put("device","cloudlet");

        String jsonString  = json.toString();
        return jsonString;


    }


}
