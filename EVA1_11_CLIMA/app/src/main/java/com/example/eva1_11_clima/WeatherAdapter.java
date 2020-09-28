package com.example.eva1_11_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter <Weather> {

    Weather[] objects;
    Context context;
    private int resource;
    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            //Pimera vez que hay que crear layout
        convertView = ((Activity)context).getLayoutInflater().inflate(resource, parent, false);
        }
        //Hay que recuperar los componentes
        ImageView imageView;
        TextView ciudad, grados, descripsion;
        imageView = convertView.findViewById(R.id.imageView);
        ciudad = convertView.findViewById(R.id.ciudad);
        grados = convertView.findViewById(R.id.grados);
        descripsion = convertView.findViewById(R.id.descripsion);

        imageView.setImageResource(objects[position].getImage());
        ciudad.setText(objects[position].getCity());
        grados.setText(""+objects[position].getWeather());
        descripsion.setText(objects[position].getDesc());

        return convertView;
    }
}
