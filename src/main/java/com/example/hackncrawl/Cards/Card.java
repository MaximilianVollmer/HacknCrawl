package com.example.hackncrawl.Cards;

import com.example.hackncrawl.Cards.CardPictures.Base64getter;

public class Card {
    Number value;
    String category;
    String kind;
    String name;
    String png_file;

    public Card(Number value, String category, String kind, String png_file){
        this.value = value;
        this.category = category;
        this.kind = kind;
        this.name = category+" "+kind;
        this.png_file = "C:/Users/Franzen/Desktop/Studium/3. Semester/Java/HacknCrawl/src/main/java/com/example/hackncrawl/Cards/CardPictures/"+png_file+".png";
    }

    public String getHtml(){
        Base64getter getter = new Base64getter(this.png_file);
        String html = "<div style='background-image: url("+getter.getBase64()+");background-size: contain;background-repeat: no-repeat;height:189px;width:138px;'></div>";
        return html;
    }

    public Object getInformations(){
        return "Name: "+this.name+"\nWert: "+this.value+"\nKategorie: "+this.category+"\nArt: "+this.kind;
    }
}
