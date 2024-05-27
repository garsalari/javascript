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
console.log('--------------------------------------');
// interpolation

function getName(name, last) {
  return 'hola ' + name + ' ' + last;
}
console.log(getName('ariel', 'garcia'));

function getNameInter(name, last) {
  return `hola ${name} ${last}`;
}
console.log(getNameInter('gaby','vigabriel'));

// es la propiedad para concatenar cadenas de una mejor forma visual
console.log('--------------------------------------');
// PROMESAS

let response = fetch("https://jsonplaceholder.typicode.com/users");

console.log(response);
// nos retorna una prometa en estado pendiente

fetch("https://jsonplaceholder.typicode.com/us ers")
  .then((res) => {
    res.json().then((data) => {
      console.log(data);
    });
  });
// una forma de manejar una prometa es con then

fetch("https://jsonplaceholder.typicode.com/us ers")
  .then((res) => res.json())
  .then((data) => console.log(data));

// solo una forma visual mas limpia
console.log('--------------------------------------');
// usando async await
const getUser = async() => {
  const res = await fetch("https://jsonplaceholder.typicode.com/users");
  const data = await res.json();
  console.log(data);
};
getUser();

console.log('--------------------------------------');
// PROMESAS propias

const fakepro = new Promise((resolved, rejected) => {
  setTimeout(() => {
    resolved("hola");
  }, 2000);
});

async function pro() {
  const res = await fakepro;
  console.log(res);
}
pro();

console.log('+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++');
/*
	1. Implement ES6 into the 'john' {}
  2. Return value from the 'deduct' () after 2s
*/

var john = {
	name: 'John Doe',
  balance: 1500,
  deduct: function(amount) {
  	this.balance = this.balance - amount;
    return this.name + ' has a balance of ' + this.balance;
  }
}

document.body.innerText = john.deduct(200);

// response

const john = {
	name: 'John Doe',
  balance: 1500,
  deduct(amount)  {
    return new Promise((res, rej) => {
      setTimeout(() =>{
        this.balance = this.balance - amount;
        res(`${this.name} has a balance of ${this.balance}`);
      }, 2000);
    });
  }
}

john.deduct(200).then((res) => {
  console.log(res);
});
console.log('+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++');
// 	Null vs Undefined
undefined means a variable has been declared but has not yet been assigned a value
null is an assignment value. It can be assigned to a variable as a representation of no value
console.log('+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++');
//	Hoisting
is a mechanism where variable and function declarations are moved to the top of their containing scope during the compilation phase
console.log('+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++');
// JSONP
JSON y JSONP son básicamente lo mismo y lo único que los difiere es su envoltura. 
En JSONP en lugar de enviar solo el dato, lo que se envía es una función, normalmente llamada callback,
que es como un JavaScript que engloba el dato que hemos solicitado. Por eso, el nombre de JSONP como JSON con padding
console.log('+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++');
