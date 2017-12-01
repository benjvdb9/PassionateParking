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
        OutputStream fileOutputStream = new FileOutputStream("Parking.json");
        JsonGenerator generator = Json.createGenerator(fileOutputStream);

        Size newSize = new Size(200,300);
        Place newPlace = new Place(newSize);
        generator.writeStartObject();
        generator.write("length",newPlace.getSize_place().getLength())
                .write("width",newPlace.getSize_place().getWidth())
                .write("price",newPlace.getPrice())
                .write("free", newPlace.isFree());
        generator.writeEnd();
        generator.close();
        System.out.println(newPlace.toString());
    }
}
