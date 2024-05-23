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

console.log('--------------------------------------');
// HOISTING

var x = 5;

(function () {
  console.log("x:", x); // no obtenemos '5' sino 'undefined'
  var x = 10;
  console.log("x:", x); // 10
})();
console.log("x:",x);
///////////////////////////////////////////////
var y = 5;

(function () {
  var y; // Se elevo la declaración
  console.log("y:", y); // undefined
  y = 10;
  console.log("y:", y); // 10
})();
console.log("y:",y);
// el concepto de hoisting se basa en q las funciones y las variables VAR se declaran en el inicio 

console.log('--------------------------------------');
// objetos CONST podemos mutarlos

const person = {
  name: 'ariel',
  lastName: 'garcia'
}

//person = ''; // Uncaught
person.name = 'change';
console.log(person);

console.log('--------------------------------------');
// objetons literales

const frutas = ['pera', 'manzana', 'naranja'];
console.log(frutas[1]);

const animal = {
  color: 'rojo',
  tamano: 7,
  peso: 12
};
console.log(animal);
console.log(animal.tamano);
console.log(animal['color']); // esto es util en el siguiente caso

const todos = {
  "1234-1234": {
    title: 'libro1',
    complete: true
  },
  "1234-1235": {
    title: 'libro1',
    complete: true
  }
}
console.log(todos['1234-1234'].title);
console.log('--------------------------------------');
// opcional chaining operator ?

const opop = {
  title: 'some',
  pages: 5,
  favoritos: {
    angular: {
      oaka: true
    },
    react: {
      ok: false
    }
  }
};
console.log(opop.favoritos?.angular?.ok);

console.log('--------------------------------------');
// destructuring en objetos y arrays

const dest = {
  color: 'red',
  tamano: 5,
  peso: 1
};

let {peso, tamano, color} = dest;
console.log(peso);
console.log(color);
// destructuring con objetos funciona con el nombre de la variable

const destru = ['uno', 'dos', 'tres'];
const [oto, due] = destru;
console.log(oto);
// destrcturing con array funciona con el index
