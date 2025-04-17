const idade = 18;

if (idade < 16) {
    console.log("Você não pode votar!");
} else if (idade >= 16 && idade <= 17) {
    console.log("Você pode votar, mas não é obrigatório!");
} else if (idade >= 18 && idade <= 65) {
    console.log("É obrigatório você votar!");
} else if (idade > 65) {
    console.log("Você pode votar, mas não é obrigatório!");
}