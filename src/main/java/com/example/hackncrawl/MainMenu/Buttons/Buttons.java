package com.example.hackncrawl.MainMenu.Buttons;

public class Buttons {
    
    Boolean is_pressed = false;
    String name = "Platzhalter";

    Buttons(String name){
        this.name = name;
    }

    public void getInformations(){
        System.out.println(this.name);
        System.out.println(this.is_pressed);
    }
}
