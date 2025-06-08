function generateEmail(name, department, date) {
  return `Dear ${name},
  
  Welcome to the ${department} team! Your joining date is ${date}.`;
}
console.log(generateEmail("Aniket", "GenC Internship", "10th June"));
