export function promise(){
    var p1=new Promise(function(resolve,reject){
        resolve(5);
    });

    var p2=new Promise(function(resolve,reject){
        resolve(10);
    });

    Promise.all([p1, p2]).then(function (promises) {console.log(promises[0]+promises[1])});   

}