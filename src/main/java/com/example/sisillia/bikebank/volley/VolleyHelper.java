package com.example.sisillia.bikebank.volley;

import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mfatihas on 7/28/2017.
 */

public class VolleyHelper {
    public static final String TAG = AppController.class
            .getSimpleName();

    public void getSakit(final VolleyCallback callback, int smoker, int umur, int gender, int history) throws JSONException {
        // Tag used to cancel the request
        String tag_json_obj = "json_obj_req";

        Log.d("volley","jalan");

        String url = "https://flask.gravicodev.id/proses";

        JSONObject requestJSON = new JSONObject();

        requestJSON.put("smoker",0);

        requestJSON.put("umur", 0);
        requestJSON.put("gender", 0);
        requestJSON.put("history", 0);

        final String requestBody = requestJSON.toString();

        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.POST, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        //...
                        callback.onSuccess(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //...
                    }
                })
        {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json");
                return headers;
            }


            @Override
            public byte[] getBody() {
                try {
                    return requestBody == null ? null : requestBody.getBytes("utf-8");
                } catch (UnsupportedEncodingException uee) {
                    VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s",
                            requestBody, "utf-8");
                    return null;
                }
            }
        };

        request.setRetryPolicy(new DefaultRetryPolicy(10000,DefaultRetryPolicy.DEFAULT_MAX_RETRIES,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
// Adding request to request queue
        AppController.getInstance().addToRequestQueue(request, tag_json_obj);
    }

    public void getSakit2(final VolleyCallback callback, String latitude, String longitude) throws JSONException {
        // Tag used to cancel the request
        String tag_json_obj = "json_obj_req";

        Log.d("volley","jalan");

        String url = "https://api.agri.gravicodev.id/panen/get?kw=350901";

        JsonObjectRequest request = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        callback.onSuccess(response);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub

                    }
                });

        request.setRetryPolicy(new DefaultRetryPolicy(10000,DefaultRetryPolicy.DEFAULT_MAX_RETRIES,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
// Adding request to request queue
        AppController.getInstance().addToRequestQueue(request, tag_json_obj);
    }
}
