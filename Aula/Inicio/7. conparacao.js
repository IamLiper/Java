const idade1 = 10 // numérico
const idade2 = '10' // texto
const idade3 = 30 // numérico

console.log('Igualdade')
// Comparar conteúdo
console.log(idade1 == idade2)

// Compara tipo e conteído
console.log(idade1 === idade2)

console.log("\nAND")
console.log(idade1 == idade2 && idade1 == idade3)

console.log("\nOR")
console.log(idade1 == idade2 || idade1 == idade3)
