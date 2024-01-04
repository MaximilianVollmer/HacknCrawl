package com.example.hackncrawl.MainMenu;

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
        html_creation_string+=spacer+hosting.htmlCreator()+spacer+join.htmlCreator()+spacer+settings.htmlCreator();
        return html_creation_string;
    }
    
    public static void main(String[] args) {
        // MainMenu menu = new MainMenu();
        // menu.createMenu(); 
    }
}
