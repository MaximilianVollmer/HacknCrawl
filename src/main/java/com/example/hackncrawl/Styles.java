package com.example.hackncrawl;

public class Styles {
    String styles= "body{text-align: center;align-items: center;}button{font-family:'Algerian';background-color: black;color: white;width: 100px;height: 30px;}";
    public Styles(){
    }
    public String getStyles(){
        return "<style>"+this.styles+"</style>";
    }
}
