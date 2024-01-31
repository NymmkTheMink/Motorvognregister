let ikke_all_input = true

function regBil() {
    ikke_all_input = false

    inputFinnes()

    if (ikke_all_input == false) {
        const bil = {
            persNum : $("#persNum").val(),
            navn : $("#navn").val(),
            adresse : $("#adresse").val(),
            kjennetegn : $("#kjennetegn").val(),
            bilmerke : $("#valgtBilMerke").val(),
            biltype : $("#valgtBilType").val()
        }

        const url = "/lagre";

        $.get(url, bil,function(retur){
          hentAlle();
        });
                                         
        $("#persNum").val("");
        $("#navn").val("");
        $("#adresse").val("");
        $("#kjennetegn").val("");
        $("#valgtBilMerke").val("");
        $("#valgtBilType").val("");
    }

    else {
        window.alert("Du må fylle ut hele skjema!")
    }
}

$(function(){ // kjøres når dokumentet er ferdig lastet
    hentAlleBiler();
});
function hentAlleBiler() {
    $.get("/hentBiler", function( biler ) {
        formaterMerke(biler);
        formaterTyper(biler);
    });
}


function formaterMerke(biler){
    let ut = "<select id='valgtBilMerke'>";
    for(const bil of biler ){
        ut+="<option value='"+bil.modell+"'>"+bil.merke+"</option>";
    }
    ut+="</select>";
    $("#bilmerke").html(ut);
}

function formaterTyper(biler){
    let ut = "<select id='valgtBilType'>";
    for(const bil of biler ){
        ut+="<option value='"+bil.merke+"'>"+bil.modell+"</option>";
    }
    ut+="</select>";
    $("#biltype").html(ut);
}


function inputFinnes(){
    if ($("#persNum").val() == ""){
        ikke_all_input = true
    }

    if ($("#navn").val() == ""){
        ikke_all_input = true
    }

    if ($("#adresse").val() == ""){
        ikke_all_input = true
    }

    if ($("#kjennetegn").val() == ""){
        ikke_all_input = true
    }

    if ($("#valgtBilMerke").val() == null){
        ikke_all_input = true
    }

    if ($("#valgtBilType").val() == null){
        ikke_all_input = true
    }

}


function hentAlle() {
    $.get( "/hentAlle", function( data ) {
        formaterData(data);
    });
}

function formaterData(biler){
    var ut = "<table>" +
        "<tr>" +
        "<th>Eiers personnummer</th><th>Eiers navn</th> <th>Eiers adresse</th><th>Kjennetegn</th><th>Bilmerke</th><th>Biltype</th>" +
        "</tr>";
    for(let i in biler ){
        ut+="<tr><td>"+biler[i].persNum+"</td><td>"+biler[i].navn+"</td><td>"+biler[i].adresse+"</td><td>"+biler[i].kjennetegn+"</td><td>"+biler[i].bilmerke+"</td><td>"+biler[i].biltype+"</td></tr>"
    }
    $("#bilene").html(ut);
}

function slettAlle() {
    $.get( "/slettAlle", function( data ) {
        hentAlle();
    });
}

