var resultado = 0
for (contador = 0; contador < 16; contador++) {
    var resultado = resultado*3;
    if (resultado == 0) {
        var resultado = resultado+1;
    }
    alert("3 ^ "+contador+" = "+resultado)
}