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
import javax.json.JsonValue;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class ReadJson {
    public static void main(String[] args){

        String file = "Parking.json";
        try {
            InputStream fileInputStream = new FileInputStream(file);
            JsonParser jsonParser = Json.createParser(fileInputStream);
            System.out.println("It worked!");

            String keyName;
            String string;
            long number;
            String[] value = new String[]{null,null};

            while (jsonParser.hasNext()){
                Event event = jsonParser.next();
                switch (event){
                    case KEY_NAME:
                        keyName = jsonParser.getString();
                        value[0] = keyName;
                        value[1] = null;
                        break;
                    case VALUE_NUMBER:
                        number = jsonParser.getLong();
                        value[1] = Long.toString(number);
                        break;
                    case VALUE_STRING:
                        string = jsonParser.getString();
                        value[1] = string;
                        break;
                    case VALUE_FALSE:
                        value[1] = "false";
                        break;
                    case VALUE_TRUE:
                        value[1] = "true";
                        break;
                    default:
                        value[0]=null;
                        value[1]=null;
                        //do nothing
                }
                if (value[0] != null && value[1] != null){
                    System.out.println(value[0]+": "+value[1]);
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
            System.out.println("File not found");
        }
    }
}
