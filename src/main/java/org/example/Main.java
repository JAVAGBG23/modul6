package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        // file path
        String fileName = "src/main/user.json";

        // skapar en user
        User user = new User(1, "Helena");

        FileWriter fw = new FileWriter(fileName);
        gson.toJson(user, fw);
        // obs viktigt att antingen använda close();
        // använd fw.flush(); om programmet ska fortsätta jobba med FileWriter
        fw.close();

        System.out.println(user.getId() + " " + user.getName());















    }
}