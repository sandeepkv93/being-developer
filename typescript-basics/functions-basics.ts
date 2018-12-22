console.log('\n****foo1****');
function foo1(a: number, b: number, c: string) {
    console.log(a + b);
    console.log(c);
}
foo1(10, 30, "sandeep");

console.log('\n****foo2****');
function foo2(a: number, b: number): number {
    return a + b;
}
console.log(foo2(10, 20));

console.log('\n****foo3****');
var foo3 = function (a: number, b: number): number {
    return a + b;
}
console.log(foo3(100, 200));

console.log('\n****foo4****');
var foo4 = function (a: number, b: number, c: number = 0, d: number = 0): number { // can supply default values too
    return a + b + c + d;
}

console.log(foo4(10, 20));
console.log(foo4(10, 20, 30));
console.log(foo4(10, 20, 30, 40));

console.log('\n****foo5****');
var foo5 = function (a: number, b: number, c: number = 0, d: number = 0, e ? : number): number { // ? means optional argument
    if (e != null) {
        return a + b + c + d + e;
    } else {
        return a + b + c + d;
    }
}
console.log(foo5(10, 20));
console.log(foo5(10, 20, 30));
console.log(foo5(10, 20, 30, 40));
console.log(foo5(10, 20, 30, 40, 50));