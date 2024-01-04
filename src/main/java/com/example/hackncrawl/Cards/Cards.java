package com.example.hackncrawl.Cards;

public class Cards {
    Number value;
    String category;
    String kind;
    String name;

    public Cards(Number value, String category, String kind){
        this.value = value;
        this.category = category;
        this.kind = kind;
        this.name = category+" "+kind;
    }

    public Object getInformations(){
        return "Name: "+this.name+"\nWert: "+this.value+"\nKategorie: "+this.category+"\nArt: "+this.kind;
    }
}
