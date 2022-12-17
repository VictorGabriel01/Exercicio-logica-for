var base = parseInt(prompt("Digite o valor da base:"));
var expo = parseInt(prompt("Digite o valor do expoente:"));
var resultado = 1;
for (contador = 1; contador <= expo; contador++) {
    var resultado = resultado * base;
}
alert(base+" elevado a "+expo+" é "+resultado);