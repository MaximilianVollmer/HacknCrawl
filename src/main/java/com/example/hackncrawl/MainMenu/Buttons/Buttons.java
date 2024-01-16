package com.example.hackncrawl.MainMenu.Buttons;

public class Buttons {
    
    Boolean is_pressed = false;
    String name = "Platzhalter";

    Buttons(String name){
        this.name = name;
    }

    public String htmlCreator(){
        String javascript = "<script>document.getElementById('"+this.name+"').addEventListener('click', function(e) {document.location.href='http://localhost:8080/"+this.name+"'})</script>";
        return "<button id="+this.name+">"+this.name+"</button>"+javascript;
    }

    public void getInformations(){
        System.out.println(this.name);
        System.out.println(this.is_pressed);
    }
}
