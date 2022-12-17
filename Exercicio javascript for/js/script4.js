var soma = 1;
for (contador = 1; contador < 501; contador++) {
    if (contador % 2 == 0) {
        var soma = soma+contador;
    }
}
alert("A somatoria de todos os valores pares de 1 a 500 é: "+ soma);