stompClient = new StompJs.Client({
    brokerURL: 'ws://localhost:8080/gs-guide-websocket'
});
previewStompClient = new StompJs.Client({
    brokerURL: 'ws://localhost:8080/gs-guide-websocket'
});



stompClient.onConnect = (frame) => {
    //setConnected(true);
    console.log('Connected: ' + frame);
    stompClient.subscribe('/lobby/played', (card) => {
        showCard(JSON.parse(card.body));
    });
};

previewStompClient.onConnect = (frame) => {
    console.log('Connected: ' + frame);
    previewStompClient.subscribe('/lobby/previewed', (preview) => {
        showPreview(JSON.parse(preview.body));
    })
}

stompClient.onWebSocketError = (error) => {
    console.error('Error with websocket', error);
};

stompClient.onStompError = (frame) => {
    console.error('Broker reported error: ' + frame.headers['message']);
    console.error('Additional details: ' + frame.body);
};

function connect() {
    stompClient.activate();
    previewStompClient.activate();
}

function disconnect() {
    stompClient.deactivate();
    console.log("Disconnected");
}

function sendCard() {
    stompClient.publish({
        destination: "/app/playing",
        body: JSON.stringify({'symbol': $("#name").val(), 'number': $("#number").val(), 'card': null})
    });
}

function sendPreview() {
    previewStompClient.publish({
        destination: "/app/preview",
        body: JSON.stringify({'symbol': $("#name").val(), 'number': $("#number").val(), 'card': null})
    });
}

let symbol = 0;
let number = 0;
function showCard(message) {
    $(".killedChild").replaceWith("<tr class='killedChild'><td>" + message.symbol + ", " + message.number + "</td></tr>");
    $("#card").replaceWith(message.card);
}

function showPreview(message) {
    $("#preview").replaceWith(message.card);
    console.log("testus");
}

$(function () {
    $("form").on('submit', (e) => {e.preventDefault(); return false});
    // $("#name").on('change', (e) => {e.preventDefault(); sendPreview()})
    // $("#numbers").on('change', (e) => {e.preventDefault(); sendPreview()})
    $("form").on('change', (e) => sendPreview());
    $( "#connect" ).click(() => {connect(); return false;});
    $( "#disconnect" ).click(() => disconnect());
    $( "#send" ).click(() => sendCard());
});

window.addEventListener("load", (event) => {
    console.log("page is fully loaded");
    connect();
});