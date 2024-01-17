package com.example.hackncrawl.Cards;

import java.util.ArrayList;

public class CardHandler {
    int[][] big_deck = {{1,2,3,4},{2,3,4,5,6,7,8,9,10,11,12,13,14}};
    int[][] smol_deck = {{1,2,3,4},{7,8,9,10,11,12,13,14}};
    public ArrayList<Card> all_cards = new ArrayList<Card>();

    public CardHandler(Boolean is_big){
        String kind_name="";
        String category_name="";
        int[][] deck = is_big?big_deck:smol_deck;

        for (int i=0;i<deck[0].length;++i){
            String png_file_cat="";
            switch (i) {
                case 0:
                    category_name="Heart";
                    png_file_cat+="Heart";
                    break;
                case 1:
                    category_name="Diamonds";
                    png_file_cat+="Diamonds";
                    break;
                case 2:
                    category_name="Spades";
                    png_file_cat+="Shades";
                    break;
                case 3:
                    category_name="Cross";
                    png_file_cat+="Cross";
                    break;
            }
            for (int j=0;j<deck[1].length;++j){
                String png_file_kind="";
                switch (deck[1][j]){
                    case 2:
                        kind_name="Two";
                        png_file_kind+="2";
                        break;
                    case 3:
                        kind_name="Three";
                        png_file_kind+="3";
                        break;
                    case 4:
                        kind_name="Four";
                        png_file_kind+="4";
                        break;
                    case 5:
                        kind_name="Five";
                        png_file_kind+="5";
                        break;
                    case 6:
                        kind_name="Six";
                        png_file_kind+="6";
                        break;
                    case 7:
                        kind_name="Seven";
                        png_file_kind+="7";
                        break;
                    case 8:
                        kind_name="Eight";
                        png_file_kind+="8";
                        break;
                    case 9:
                        kind_name="Nine";
                        png_file_kind+="9";
                        break;
                    case 10:
                        kind_name="Ten";
                        png_file_kind+="10";
                        break;
                    case 11:
                        kind_name="Jack";
                        png_file_kind+="Jack";
                        break;
                    case 12:
                        kind_name="Queen";
                        png_file_kind+="Queen";
                        break;
                    case 13:
                        kind_name="King";
                        png_file_kind+="King";
                        break;
                    case 14:
                        kind_name="Ace";
                        png_file_kind+="Ace";
                        break;
                }
                String png_file = png_file_cat+"_"+png_file_kind;
                all_cards.add(new Card(deck[1][j], category_name, kind_name, png_file));
            }
        }
        
    }  
}
