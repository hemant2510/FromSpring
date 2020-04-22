export function orderTest(){
    let order= { id:1,
                title:"first order",
                price:500,
                printOrder(){
                    console.log(order);
                },
                getPrice(){
                    return this.price;
                }             
               }
console.log(order.getPrice())   ;
order.printOrder();
let copy = Object.assign({},order);
console.log(copy);
console.log(order);
}