package com.example.hackncrawl.MainMenu;

import com.example.hackncrawl.MainMenu.Buttons.*;

public class MainMenu {
    
    public static void main(String[] args) {
        HostGameButton hosting = new HostGameButton();
        JoinGameButton join = new JoinGameButton();
        SettingButton settings = new SettingButton();

        hosting.getInformations();
        join.getInformations();
        settings.getInformations();
    }
}
