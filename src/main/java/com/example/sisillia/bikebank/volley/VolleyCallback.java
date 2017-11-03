package com.example.sisillia.bikebank.volley;

import org.json.JSONObject;

/**
 * Created by minimonster on 8/25/2017.
 */

public interface VolleyCallback {
    void onSuccess(String result);
    void onSuccess(JSONObject json);
}
