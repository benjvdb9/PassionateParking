package com.company.json;

import com.company.Place;
import com.company.Size;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.json.Json;
import javax.json.stream.JsonGenerator;

public class WriteJson {
    public static void main(String[] args) throws IOException {
        String file = "Parking.json";
        OutputStream fileOutputStream = new FileOutputStream(file);
        JsonGenerator generator = Json.createGenerator(fileOutputStream);

        Size newSize = new Size(400,600);
        Place newPlace = new Place(newSize);
        generator.writeStartObject();
        generator.write("length",newPlace.getSize_place().getLength())
                .write("width",newPlace.getSize_place().getWidth())
                .write("price",newPlace.getPrice())
                .write("free", newPlace.isFree());
        generator.writeEnd();
        System.out.println(generator);
        generator.close();
    }
}
