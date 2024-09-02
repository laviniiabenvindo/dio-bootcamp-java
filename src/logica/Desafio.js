const valorSalario = parseFloat(prompt("Qual o seu salário?"));
const valorBeneficio = parseFloat(prompt("Qual o valor do beneficio?"));

const valorImposto = calcularImposto(valorSalario);

const saida = (valorSalario - valorImposto) + valorBeneficio;

function calcularImposto(salario){
 let aliquota;
 if (valorSalario >= 0 && valorSalario <= 1100) {
  aliquota = 0.05;
 } else if (valorSalario >= 1100.01 && valorSalario <= 2500.0) {
  aliquota = 0.10;
 } else {
  aliquota = 0.15;
 }
 return aliquota * salario;
}