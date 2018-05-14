package com.example.omersamoel.user_registration;

import android.support.v7.app.AppCompatActivity;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;

public class SignUpRequest extends StringRequest {



    private static final String REGISTER_REQUEST_URL ="https://antifouling-cosal.000webhostapp.com/Sig/Sign_Up.php";
    private Map<String, String> params ;

    public SignUpRequest(String name, String email, String password, Response.Listener<String> listener){
        super(Method.POST,REGISTER_REQUEST_URL,listener,null);
        params= new HashMap<>();
        params.put("name",name);
        params.put("email",email);
        params.put("password", password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
