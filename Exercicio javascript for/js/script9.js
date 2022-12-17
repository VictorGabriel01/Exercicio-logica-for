var valor2 = 1;
var valor1 = 1;
alert("1")
for (contador = 1; contador < 16; contador++) {
    var valor3 = valor1 + valor2;
    alert(valor3);
    var valor1 = valor2;
    var valor2 = valor3;
    contador++;
}