var a: number;
var b: boolean;
var c: string;
var foo = undefined; // no use
a = 100;
b = true;
c = "Hello World";

console.log(a);
console.log(b);
console.log(c);
console.log(foo);

var myArray = [1, 2, 3, 4, 5];
console.log(myArray);

var intArray: number[];
// intArray = [10, 20, 30, 40, "hello"]; Doesn't work
// intArray = 10; Doesn't work
intArray = [10, 20, 30, 40, 50];
console.log(intArray);

a = intArray.pop();
console.log(a);
console.log(intArray);
// b = intArray.pop(); Doesn't work because b is of type boolean.

// tuple
var tuple: [number, boolean];
tuple = [10, true];
// tuple = [10, "hello"]; Doesn't work
// tuple = [10, true, "hello"]; Doesn't work
// tuple = [10]; Doesn't work
console.log(tuple);