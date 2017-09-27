package com.i012114.taller2.Parser;


import com.i012114.taller2.Models.CountryDos;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.Parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandra Salas on 27/09/2017.
 */

public class JsonCountryDos {

    public static List<CountryDos> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CountryDos> countryDosList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            CountryDos countryDos = new CountryDos();
            countryDos.setName(item.getString("name"));
            countryDos.setCapital(item.getString("capital"));
            countryDos.setAlphacode(item.getString("alpha3Code"));
            countryDos.setPopulation(item.getString("population"));
            countryDos.setDemonym(item.getString("demonym"));
            countryDos.setTimezones(item.getString("timezones"));
            countryDosList.add(countryDos);
        }
        return countryDosList;
    }

}
