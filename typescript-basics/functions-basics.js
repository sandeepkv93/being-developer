console.log('\n****foo1****');
function foo1(a, b, c) {
    console.log(a + b);
    console.log(c);
}
foo1(10, 30, "sandeep");
console.log('\n****foo2****');
function foo2(a, b) {
    return a + b;
}
console.log(foo2(10, 20));
console.log('\n****foo3****');
var foo3 = function (a, b) {
    return a + b;
};
console.log(foo3(100, 200));
console.log('\n****foo4****');
var foo4 = function (a, b, c, d) {
    if (c === void 0) { c = 0; }
    if (d === void 0) { d = 0; }
    return a + b + c + d;
};
console.log(foo4(10, 20));
console.log(foo4(10, 20, 30));
console.log(foo4(10, 20, 30, 40));
console.log('\n****foo5****');
var foo5 = function (a, b, c, d, e) {
    if (c === void 0) { c = 0; }
    if (d === void 0) { d = 0; }
    if (e != null) {
        return a + b + c + d + e;
    }
    else {
        return a + b + c + d;
    }
};
console.log(foo5(10, 20));
console.log(foo5(10, 20, 30));
console.log(foo5(10, 20, 30, 40));
console.log(foo5(10, 20, 30, 40, 50));
