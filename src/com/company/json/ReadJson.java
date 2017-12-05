package com.company.json;

import com.company.Place;
import com.company.Size;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.json.*;

public class ReadJson {

    public static void main(String[] args){

        String file = "Parking.json";
        List<Place> all = new ArrayList<>();
        try {
            InputStream fileInputStream = new FileInputStream(file);
            JsonReader jsonReader = Json.createReader(fileInputStream);
            JsonObject object = jsonReader.readObject();
            String[] data = new String[]{"length","width","price","free"};
            for (String info:data){
                String result = object.get(info).toString();
                System.out.println(info+": "+result);
            }
            jsonReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
            System.out.println("File not found");
        }
    }
    public static List<Place> getPlaces(JsonArray jsonArray)
    {
        List<Place> places = new ArrayList<>();
        for (int i = 0;i<jsonArray.size();i++){
            JsonObject jsonObject = jsonArray.getJsonObject(i);
            int length = jsonObject.getInt("length");
            int width = jsonObject.getInt("width");
            Size size = new Size(length,width);
            Place place = new Place(size);
            places.add(place);
        }
        return places;

    }
}
