package com.example.hackncrawl.Domain;


import com.example.hackncrawl.Cards.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardPlayed {
    private String symbol;
    private String number;
    private String card;
}
