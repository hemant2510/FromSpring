import {PI} from "./components/testConst.js";
import {scope} from "./components/scopeTest.js";
import { orderTest } from "./components/objectTest.js";
import {arrowTest} from "./components/arrowstest.js"
import {add,userFriends,printCapitalNames} from "./components/parameterTest.js";
import {message} from "./components/templateTest.js";
import * as match from"./components/matchingTest.js";
import {fibonacci} from "./components/symbolTest.js";
import {armstrong} from "./components/iteratorTest.js";

/*
document.write("Hemant Raj");
console.log("Hello from es6");
console.log(PI);
scope();
orderTest();
let arr = ['Tom','Ivan','Jerry'];
arrowTest(arr)
add();
userFriends("Hemant","Priyamvad","Abhishek");
let names=["Hemant","Raj","Priyamvad","Singh","Abhishek"]
printCapitalNames(...names);
message();
let numbers=[1,2,3,4,5];
match.print(numbers);
match.deepMatching();


let obj = new fibonacci(0,1);
obj.next();
obj.next();
obj.next();
obj.next();
obj.next();


*/
let itr=armstrong[Symbol.iterator]();
console.log(itr.next());
console.log(itr.next());
console.log(itr.next());
console.log(itr.next());
console.log(itr.next());
//console.log(itr.next());



