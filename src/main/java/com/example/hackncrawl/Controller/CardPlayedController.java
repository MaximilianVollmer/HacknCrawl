package com.example.hackncrawl.Controller;


import com.example.hackncrawl.Cards.Card;
import com.example.hackncrawl.Cards.CardHandler;
import com.example.hackncrawl.Domain.CardPlayed;
import com.example.hackncrawl.Domain.CardPlaying;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@Controller
public class CardPlayedController {

    private Card card = null;
    private Card cardpreview = null;

    private CardHandler handler = new CardHandler(true);
    @MessageMapping("/playing")
    @SendTo("/lobby/played")
    public CardPlayed playCard(CardPlaying message) throws Exception{

        card = searchCard(message.getSymbol(), message.getNumber());

        return new CardPlayed(card.getCategory(), card.getKind(), card.getHtml());

    }

    private Card searchCard(String symbol, String number){

        handler.all_cards.forEach( c ->
        {
            if(Objects.equals(c.getCategory(), symbol) && Objects.equals(c.getKind(), number)){
                card = c;
            }
        });
        return card;
    }

    @MessageMapping("/preview")
    @SendTo("/lobby/previewed")
    public CardPlayed cardPreview(CardPlaying message) throws Exception{
        cardpreview = searchCard(message.getSymbol(), message.getNumber());
        return new CardPlayed(cardpreview.getCategory(), cardpreview.getKind(), cardpreview.getPreviewHtml());
    }

}
