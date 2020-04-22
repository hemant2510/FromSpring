export function print(arr){
    let[,,a,,]=arr;
    console.log("The third element is "+a);
}

export function deepMatching(){
    let org={
        name:"Hemant",
        address: {
            city:"Jamshedpur",
            state:"Jharkhand",
            pincode:"831016"
        }
    };

    let {address:{pincode}}=org;
    console.log("Pincode",pincode);
}