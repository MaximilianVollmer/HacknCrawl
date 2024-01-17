package com.example.hackncrawl.MainMenu.Buttons;

public class HowToPlay extends Buttons{
    
    public HowToPlay(){
        super("How_To_Play");
    }

    public String ClickEventListener(){
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
        style=display:none;height:90%;width:100%;font-family:'Algerian';font-size:150%;background-color:black;color:white;
        class=show 
        >Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.<br>   
        Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.<br>
        Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.<br>
        </div>
        <div 
        id=cardRules
        style=display:none;height:90%;width:100%;font-family:'Algerian';font-size:150%;background-color:black;color:white;
        >Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.<br>
        Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis.<br>
        At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, At accusam aliquyam diam diam dolore dolores duo eirmod eos erat, et nonumy sed tempor et et invidunt justo labore Stet clita ea et gubergren, kasd magna no rebum. sanctus sea sed takimata ut vero voluptua. est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat.<br>   
        Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus.<br>
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
