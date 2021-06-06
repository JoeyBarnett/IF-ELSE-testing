let raceNumber = Math.floor(Math.random() * 1000);
const registeredEarly = true
const runnersAge = 30

if ((registeredEarly) && (runnersAge > 18)) 
{raceNumber += 1000} ;

if ((registeredEarly) && (runnersAge > 18)) {
console.log(`You will race at 09:30, your race number is ${raceNumber}`);
} else if (!(registeredEarly) && (runnersAge > 18)) {
console.log(`You will race at 11:00, your race number is ${raceNumber}`);
} else if (runnersAge < 18) {
console.log(`You will race at 12:30, your race number is ${raceNumber}`);
 } else {
  console.log(`see registration desk`);
 }