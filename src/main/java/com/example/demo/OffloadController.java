package com.example.demo;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class OffloadController {

    @GetMapping(value = "/calculate")
    public String getCalculation(
        @RequestParam(value = "func", required = true) String func,
        @RequestParam(value = "para", required = true) String para){

        OffloadHelper offloadHelper = new OffloadHelper();
        try {

            return offloadHelper.offload_format(func, para);

        } catch (JSONException e) {
            e.printStackTrace();

            return "ERROR";
        }
    }

    @GetMapping(value = "/health")
    public String getHealth(){
        return "y";
    }
}
