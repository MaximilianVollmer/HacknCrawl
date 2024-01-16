package com.example.hackncrawl.Cards.CardPictures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

public class Base64getter {
    String path = "";

    public Base64getter(String path){
        this.path = path;
    }

    public String getBase64(){
        File background = new File(this.path);
        FileInputStream file;
        try{
            file = new FileInputStream(background); 
            byte[] fileContent = new byte[(int)background.length()];
            try {
                file.read(fileContent);file.close();
                String encodedString = Base64.getEncoder().encodeToString(fileContent);
                // System.out.println("data:image/png;base64,"+encodedString);
                String encoded = "data:image/png;base64,"+encodedString;
                return encoded;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Something went wrong";
    }
}
