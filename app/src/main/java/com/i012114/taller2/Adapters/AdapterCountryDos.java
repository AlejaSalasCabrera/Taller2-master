package com.i012114.taller2.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.i012114.taller2.Models.CountryDos;
import com.i012114.taller2.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandra Salas on 27/09/2017.
 */

public class AdapterCountryDos extends RecyclerView.Adapter<AdapterCountryDos.ViewHolder> {


    List<CountryDos> countryDosList = new ArrayList<>();
    Context context;
    // Constructor de la clase
    public AdapterCountryDos(List<CountryDos> countryDosList, Context context) {
        this.countryDosList = countryDosList;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
// Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdos,parent, false);
// Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
// Encargado de trabajar con el item.xml y sus componentes
        holder.textViewName.setText(countryDosList.get(position).getName());
        holder.textViewCapital.setText(countryDosList.get(position).getCapital());
        holder.textViewAlphs.setText(countryDosList.get(position).getAlphacode());
        holder.textViewPopu.setText(countryDosList.get(position).getPopulation());
        holder.textViewDeno.setText(countryDosList.get(position).getDemonym());
        holder.textViewTZ.setText(countryDosList.get(position).getTimezones());

    }
    @Override
    public int getItemCount() {
        return countryDosList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        TextView textViewCapital;
        TextView textViewAlphs;
        TextView textViewPopu;
        TextView textViewDeno;
        TextView textViewTZ;

        public ViewHolder(View item) {
            super(item);
            textViewName = (TextView) item.findViewById(R.id.id_tv_item_namecountry);
            textViewCapital = (TextView) item.findViewById(R.id.id_tv_item_namecapital);
            textViewAlphs = (TextView) item.findViewById(R.id.id_tv_item_nameabbreviation);
            textViewPopu = (TextView) item.findViewById(R.id.id_tv_item_namepopulation);
            textViewDeno = (TextView) item.findViewById(R.id.id_tv_item_namedemonym);
            textViewTZ = (TextView) item.findViewById(R.id.id_tv_item_timezone);
        }
    }

}
