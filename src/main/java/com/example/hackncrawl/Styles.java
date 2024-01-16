package com.example.hackncrawl;

public class Styles {
    String styles= "body{text-align: center;align-items: center;}button{font-family:'Algerian';font-size:150%;background-color: black;color: white;width: 200px;height: 60px;}@keyframes moveIt {from {background-position: bottom left;}to {background-position: top right;}}";
    public Styles(){
    }
    public String getStyles(){
        return "<style>"+this.styles+"</style>";
    }
}
