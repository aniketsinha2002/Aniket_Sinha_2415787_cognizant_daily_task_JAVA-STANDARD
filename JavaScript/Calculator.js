const prompt = require("prompt-sync")();

let a = Number(prompt("Enter first number: "));
let b = Number(prompt("Enter second number: "));
let operator = prompt("Enter operator (+, -, *, /): ");

switch (operator) {
  case "+":
    console.log("Result: ", a + b);
    break;
  case "-":
    console.log("Result: ", a - b);
    break;
  case "*":
    console.log("Result: ", a * b);
    break;
  case "/":
    console.log("Result: ", b !== 0 ? a / b : "Cannot divide by zero");
    break;
  default:
    console.log("Invalid operator");
}

// To - Do List Using Objects
