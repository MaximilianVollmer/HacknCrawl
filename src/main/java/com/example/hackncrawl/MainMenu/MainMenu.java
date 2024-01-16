package com.example.hackncrawl.MainMenu;
import com.example.hackncrawl.Cards.Card;
import com.example.hackncrawl.Cards.CardHandler;
import com.example.hackncrawl.Cards.CardPictures.Base64getter;
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
        Base64getter base64 = new Base64getter("C:/Users/Franzen/Desktop/Studium/3. Semester/Java/HacknCrawl/src/main/java/com/example/hackncrawl/Cards/CardPictures/Cards_Back.png");
        String body_style = "<style>body{background-image: url("+base64.getBase64()+");background-repeat: repeat; animation: moveIt 10s linear infinite;}</style>";
        html_creation_string+=body_style+spacer+hosting.htmlCreator()+spacer+join.htmlCreator()+spacer+settings.htmlCreator();
        return html_creation_string;
        // CardHandler card_handler = new CardHandler(false);
        // String cardies = "";
        // for (Card card:card_handler.all_cards){
        //     cardies += card.getHtml();
        // }
        // return cardies;
    }
    
    public static void main(String[] args) {
        // MainMenu menu = new MainMenu();
        // menu.createMenu(); 
    }
}
