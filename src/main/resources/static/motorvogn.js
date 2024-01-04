function regBil() {
    const bil = {
        persNum : $("#persNum").val(),
        navn : $("#navn").val(),
        adresse : $("#adresse").val(),
        kjennetegn : $("#kjennetegn").val(),
        bilmerke : $("#bilmerke").val(),
        biltype : $("#biltype").val()
    }

    const url = "/lagre";
    $.get(url, bil,function(retur){
        hentAlle();
    });

    $("#persNum").val("");
    $("#navn").val("");
    $("#adresse").val("");
    $("#kjennetegn").val("");
    $("#bilmerke").val("");
    $("#biltype").val("");

}

function hentAlle() {
    $.get( "/hentAlle", function( data ) {
        formaterData(data);
    });
}

function slettAlle() {

}