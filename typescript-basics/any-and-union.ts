var a; // Type is any now

a= 10;

var b: any;
b = 10;
b = true;

// any is too loosely typed.

// union: helps in partitally tightening the type of variables

var c: number | boolean;
c = 10;
c = true;
// c = "hello"; Doesn't work: Type '"hello"' is not assignable to type 'number | boolean'.