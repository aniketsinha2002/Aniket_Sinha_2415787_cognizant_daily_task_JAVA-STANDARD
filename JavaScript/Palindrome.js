const prompt = require("prompt-sync")();

function isPalindrome(str) {
  let reversed = str.split("").reverse().join("");
  return str === reversed;
}

let word = prompt("Enter a word to check for palindrome:");
console.log(isPalindrome(word) ? "It's a palindrome!" : "Not a palindrome.");
