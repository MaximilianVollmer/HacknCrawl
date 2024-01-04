package com.example.hackncrawl.Cards;

import java.util.ArrayList;

public class CardHandler {
    int[][] big_deck = {{1,2,3,4},{2,3,4,5,6,7,8,9,10,11,12,13,14}};
    int[][] smol_deck = {{1,2,3,4},{7,8,9,10,11,12,13,14}};
    ArrayList<Cards> all_cards = new ArrayList<Cards>();

    public CardHandler(Boolean is_big){
        String kind_name="";
        String category_name="";
        if(is_big){
            for (int i=0;i<big_deck[0].length;++i){
                switch (i) {
                    case 0:
                        category_name="Heart";
                        break;
                    case 1:
                        category_name="diamonds";
                        break;
                    case 2:
                        category_name="spades";
                        break;
                    case 3:
                        category_name="cross";
                        break;
                }

                for (int j=0;j<big_deck[1].length;++j){
                    switch (j){
                        case 0:
                            kind_name="Two";
                            break;
                        case 1:
                            kind_name="Three";
                            break;
                        case 2:
                            kind_name="Four";
                            break;
                        case 3:
                            kind_name="Five";
                            break;
                        case 4:
                            kind_name="Six";
                            break;
                        case 5:
                            kind_name="Seven";
                            break;
                        case 6:
                            kind_name="Eight";
                            break;
                        case 7:
                            kind_name="Nine";
                            break;
                        case 8:
                            kind_name="Ten";
                            break;
                        case 9:
                            kind_name="Jack";
                            break;
                        case 10:
                            kind_name="Lady";
                            break;
                        case 11:
                            kind_name="King";
                            break;
                        case 12:
                            kind_name="Ace";
                            break;
                    }
                    this.all_cards.add(new Cards(big_deck[1][j], category_name, kind_name));
                }
            }
        }
        else{
            for (int i=0;i<smol_deck[0].length;++i){
                switch (i) {
                    case 0:
                        category_name="Heart";
                        break;
                    case 1:
                        category_name="diamonds";
                        break;
                    case 2:
                        category_name="spades";
                        break;
                    case 3:
                        category_name="cross";
                        break;
                }

                for (int j=0;j<smol_deck[1].length;++j){
                    switch (j) {
                        case 0:
                            kind_name="Seven";
                            break;
                        case 1:
                            kind_name="Eight";
                            break;
                        case 2:
                            kind_name="Nine";
                            break;
                        case 3:
                            kind_name="Ten";
                            break;
                        case 4:
                            kind_name="Jack";
                            break;
                        case 5:
                            kind_name="Lady";
                            break;
                        case 6:
                            kind_name="King";
                            break;
                        case 7:
                            kind_name="Ace";
                            break;
                    }
                    this.all_cards.add(new Cards(smol_deck[1][j], category_name, kind_name));
                }
            }
        }
        
    }  

    public static void main(String[] args) {
        CardHandler card_handler = new CardHandler(true);
        System.out.println(card_handler.all_cards.size());
        for (Cards card:card_handler.all_cards){
            System.out.println(card.getInformations());
        }
    }
}
