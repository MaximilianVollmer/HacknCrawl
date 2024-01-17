package com.example.hackncrawl.MainMenu.Buttons;

import com.example.hackncrawl.Cards.Card;

public class HowToPlay extends Buttons{
    
    public HowToPlay(){
        super("How_To_Play");
    }

    public String ClickEventListener(){
        Card heart_7 = new Card(7, "Heart", "Seven", "Heart_7");
        Card heart_8 = new Card(8, "Heart", "Eight", "Heart_8");
        Card heart_jack = new Card(11, "Jack", "Seven", "Heart_Jack");
        String heart_7_card = heart_7.getHtml();
        String heart_8_card = heart_8.getHtml();
        String heart_jack_card = heart_jack.getHtml();

        String html = """
        <div
        id=ButtonHolder
        style=height:10%;width:100%;display:flex;
        >
        <button
        id=showGenRules
        style=opacity:0.4;height:100%!important;width:47%!important;
        class=Clicked
        >General Rules
        </button>
        <button
        id=showCardRules
        style=opacity:0.4;height:100%!important;width:47%!important;
        >Card Rules
        </button> 
        <button
        id=back
        style=opacity:0.8;height:100%!important;width:6%!important;
        >X
        </button>
        </div>
        <div 
        id=genRules
        style=display:none;height:90%;width:100%;font-family:'Algerian';font-size:150%;background-color:black;color:white;text-align:left;
        class=show 
        ><br>
        1. At the beginning of the game, every player receives 5 cards, the rest becomes the draw pile.<br> Moreover a 'starting card' is drawn and put in the middle. This becomes the play pile.
        <br><br>
        2. The host begins and chooses a card from their hand, which matches the 'starting card'.<br> 'Matching' are those cards, that are either the same suit (Hearts, Diamonds, etc.) or the same value (9, 10, Queen, etc.) as the top card on the play pile.
        <br><br>
        3. During each player's turn, they can put one matching card from their hand onto the play pile.<br> If a player doesn't possess a matching card, they must draw one from the draw pile.<br> If the newly drawn card is playable, the player is then allowed to put it on the play pile; if not, their turn is over and they have to wait till the next round.
        <br><br>
        4. If a player plays their second to last card, they must say 'Mau'; if they forget about it, they have to draw another card as a penalty.
        <br><br>
        5. Whoever empties their hand first by putting all cards onto the play pile, wins and must say 'Mau-Mau'.
        </div>
        <div 
        id=cardRules
        style=display:none;height:90%;width:100%;font-family:'Algerian';font-size:150%;background-color:black;color:white;text-align:left;
        >
        """+heart_7_card+"""
        Whenever a player plays a card with the value '7', the next player must draw 2 cards. However, if the next player already possesses a '7', they can put it on top of the other '7' without drawing 2 cards themselves. Instead, the next player must draw 4 cards.
        <br><br>
        """+heart_8_card+"""
        If an '8' is played, the next player is skipped and has to wait till the next round. (When played with 2 players, the player, who put the '8' on the play pile, can simply play another card.)
        <br><br>
        """+heart_jack_card+"""
        A 'Jack' can be put on any card, no matter its value or suit. Moreover, whoever plays it, is allowed to 'wish' for a suit. The next player must therefore play a card with this suit; however they aren't allowed to play another 'Jack'.
        </div>
        """;
        String style ="<style>.show{display:block!important;opacity:0.8;}.Clicked{opacity:0.8!important;}</style>";
        String javascript= """
        <script>
        const gen_rules = document.getElementById('genRules');
        const card_rules = document.getElementById('cardRules');
        const show_gen_rules = document.getElementById('showGenRules');
        const show_card_rules = document.getElementById('showCardRules');

        show_card_rules.addEventListener('click',()=>{
            if(card_rules.classList.contains('show')){
                return
            }
            else{
                gen_rules.classList.toggle('show')
                card_rules.classList.toggle('show')
                show_gen_rules.classList.toggle('Clicked')
                show_card_rules.classList.toggle('Clicked')
            }
        })
        show_gen_rules.addEventListener('click',()=>{
            if(gen_rules.classList.contains('show')){
                return
            }
            else{
                card_rules.classList.toggle('show')
                gen_rules.classList.toggle('show')
                show_gen_rules.classList.toggle('Clicked')
                show_card_rules.classList.toggle('Clicked')
            }
        })
        document.getElementById('back').addEventListener('click',()=>{
            document.location.href='http://localhost:8080/Test'
        })
        </script>
        """;
        return style+html+javascript;
    }
}
