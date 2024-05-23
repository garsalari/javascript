console.log('--------------------------------------');
// const vs let
const contador = 'contador';
console.log(contador);
let contadorlet = 'contadorlet';
console.log(contadorlet);

contadorlet = 5;
console.log(contadorlet);

// ambos nos permiten ASIGNAR valores
// const no permite REASIGNAR valores
// let permite REASIGNAR valores incluso cambiando el type
// const necesita un valor 
console.log('--------------------------------------');
// ambito

const amb = 'amb';
console.log(amb);
if (true) {
  const amb = 'bma';
  console.log(amb);
}
console.log(amb);
// let y const no permiten duplicar una variable en el mismo ambito
// JS busca en el ambito y luego hacia arriba


console.log('--------------------------------------');
// ambito VAR

console.log(varGlobal); // undefined
if (true) {
  var varGlobal = 'bma';
  console.log(varGlobal); // bma
}
console.log(varGlobal); // bma
// VAR siempre se va como variable global
