package com.company.json;

import com.company.Place;
import com.company.Size;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonGenerator;
import java.io.*;


public class WriteJson {
    public static void main(String[] args) throws IOException {
        String file = "Parking.json";
        InputStream fileInputStream = new FileInputStream(file);
        JsonReader jsonReader = Json.createReader(fileInputStream);
        JsonObject object = jsonReader.readObject();
        jsonReader.close();

        OutputStream fileOutputStream = new FileOutputStream(file);
        JsonGenerator generator = Json.createGenerator(fileOutputStream);

        Size newSize = new Size(300,200);
        Place newPlace = new Place(newSize);
        generator.writeStartArray(); //start array
        // add previous objects
        generator.writeStartObject(); // start object
        generator.write("length",newPlace.getSize_place().getLength())
                .write("width",newPlace.getSize_place().getWidth())
                .write("price",newPlace.getPrice())
                .write("free", newPlace.isFree());
        generator.writeEnd();
        generator.writeEnd(); //end array
        generator.close();
    }
}
