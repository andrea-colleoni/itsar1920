var a = 10;
var b = 20;
if (a < b) {
    console.log('a è minore di b!');
}

function f() {
    console.log('sono in una funzione');
}

function j() {
    a = 100;
    a++;
    console.log(`il valore di a  è ${a} invece this.a vale ${this.a}`);
    if (10 > 1) {
        var b = 1000;
        console.log(b);
    }
    console.log(b);
}