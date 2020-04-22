export function add(name="Hemant",age=21){
    console.log(name,age);
}

export function userFriends(username,...friends){
    console.log("Username : " + username);
    console.log("Friends : " + friends);
}

export function printCapitalNames(a,b,c,d,e){
    console.log(a.toUpperCase(),b.toUpperCase(),c.toUpperCase(),d.toUpperCase(),e.toUpperCase());
}