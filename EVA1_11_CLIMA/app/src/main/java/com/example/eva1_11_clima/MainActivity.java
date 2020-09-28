package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lstVwClima;
    List<Weather> lstCiudades = new ArrayList<>();
    /*
    Weather[] cities = {
            new Weather("Chihuahua",20,"Nublado",R.drawable.light_rain),
            new Weather("Juarez",15,"Niebla",R.drawable.cloudy),
            new Weather("Delicias",28,"Chingo de sol",R.drawable.snow),
            new Weather("Nuevo casas grandes",22,"Soleado",R.drawable.thunderstorm),
            new Weather("Meoqui",27,"Sharknado",R.drawable.sunny),
            new Weather("Camargo",23,"Cuidado balaceras",R.drawable.atmospher),
            new Weather("La Perla",24,"Andamos bien prendidos",R.drawable.snow),
            new Weather("Torreon",25,"Pa carnita asada",R.drawable.cloudy),
            new Weather("Aldama",26,"Lluvia",R.drawable.tornado),
            new Weather("Villas",27,"Cascada",R.drawable.cloudy),
            new Weather("Saucito",28,"Enfierrados",R.drawable.snow),
        */


};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwClima = findViewById(R.id.lstVwClima);

        JsonObjectRequest JsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                jsonRequest: null,
                new Response.Listener<JSONObject>(){
                    @Override
                    public void onResponse(JSONObject response){
                    }
        },
        new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){

        }
        }
        )
        //lstVwClima.setAdapter(new WeatherAdapter(this,R.layout.mi_layout,cities));
    }
}
