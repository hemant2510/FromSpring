export function arrowTest(arr){
let output=[];
let dummy={};
arr.map(e => {
    dummy={name:e,length:e.length}
    output.push(dummy)});
    console.log(output);
}

