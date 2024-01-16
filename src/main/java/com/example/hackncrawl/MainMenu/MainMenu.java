package com.example.hackncrawl.MainMenu;

import java.io.File;
import java.util.Base64;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.commons.*;

import com.example.hackncrawl.MainMenu.Buttons.*;

public class MainMenu {
    String html_creation_string ="";

    HostGameButton hosting = new HostGameButton();
    JoinGameButton join = new JoinGameButton();
    SettingButton settings = new SettingButton();
    
    public MainMenu(){

    }

    public String createMenu(){
        String spacer = "<br><br>";
        ClassLoader classLoader = getClass().getClassLoader();
        File background = new File(classLoader
          .getResource("../Cards/CardPictures/Cards_Back.png")
          .getFile());
        byte[] fileContent = FileUtils.readFileToByteArray(background);
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        System.out.println(encodedString);
        String body_style = "<style>background-image: url("+encodedString+");background-repeat: repeat-x;}";
        html_creation_string+=body_style+spacer+hosting.htmlCreator()+spacer+join.htmlCreator()+spacer+settings.htmlCreator();
        return html_creation_string;
    }
    
    public static void main(String[] args) {
        // MainMenu menu = new MainMenu();
        // menu.createMenu(); 
    }
}
