package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteArrayToJson {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        // file path
        String fileName = "src/main/user.json";

        FileWriter fw = new FileWriter(fileName);

        // skapa en arraylist av typen User
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User(1, "Helena"));
        userList.add(new User(2, "Tore"));
        userList.add(new User(3, "Doris"));

        gson.toJson(userList, fw);
        fw.close();




































    }
}
