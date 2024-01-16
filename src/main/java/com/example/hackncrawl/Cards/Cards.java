package com.example.hackncrawl.Cards;

public class Cards {
    Number value;
    String category;
    String kind;
    String name;
    String png_file;

    public Cards(Number value, String category, String kind, String png_file){
        this.value = value;
        this.category = category;
        this.kind = kind;
        this.name = category+" "+kind;
        this.png_file = png_file;
    }

    public String getHtml(){
        return "";
    }

    public Object getInformations(){
        return "Name: "+this.name+"\nWert: "+this.value+"\nKategorie: "+this.category+"\nArt: "+this.kind;
    }
}
