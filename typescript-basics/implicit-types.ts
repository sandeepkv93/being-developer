var a = 10;
var b = true;
var c = "hello";

// a = true; Doesn't work, gives the error: Type 'true' is not assignable to type 'number'
// Based on initial assignment, typescript assigns an implicit type.

function greet() {
    return 'Good Morning';
}

var greeting = greet();

// greeting = 10; Doesn't work

// But if you separate decalaration and assignment in a separate line, implicit typing would be 'any'

var newGreeting;
newGreeting = greet(); // Typeof newGreeting is any

newGreeting = 10; // Works now!