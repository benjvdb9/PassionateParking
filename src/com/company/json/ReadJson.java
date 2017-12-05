package com.company.json;

import com.company.Place;
import com.company.Size;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
public class ReadJson {

    public static void main(String[] args){

        String file = "Parking.json";
        Place[] all = new Place[]{};
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
    public Place getPlace(Integer width, Integer length, String price, String free){
        Size size = new Size(width,length);
        return new Place(size);
    }
}
