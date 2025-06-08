const prompt = require("prompt-sync")();

// Using if-else Statements
// omparison Operators
// Arithmetic Operations

let num1 = Number(prompt("Enter the first number: "));
let num2 = Number(prompt("Enter the second number: "));

if (num1 > 0) {
  console.log(`${num1} is positive.`);
} else if (num1 < 0) {
  console.log(`${num1} is negative.`);
} else {
  console.log(`${num1} is zero.`);
}

if (num1 > num2) {
  console.log(`${num1} is greater than ${num2}.`);
} else if (num1 < num2) {
  console.log(`${num1} is less than ${num2}.`);
} else {
  console.log(`${num1} is equal to ${num2}.`);
}

console.log("Addition:", num1 + num2);
console.log("Subtraction:", num1 - num2);
console.log("Multiplication:", num1 * num2);
console.log("Division:", num1 / num2);
console.log("Modulus:", num1 % num2);
