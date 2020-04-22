function* armstrongNumber(){
    let num=152;
    let a=0;
    let dummy=0;
    let flag=false;
    while(flag==false){
        let sum=0;
        dummy=num; 
        while(num!=0){
            a=num%10;
            num=Math.floor(num/10);
            sum=sum+(a*a*a);
        }
        if(sum==dummy){
            flag=true;
            num=dummy+1;
            let reset = yield sum;
            if(reset){
                num=0;
            }
        } 
        else{
            num=dummy+1;
        }
    }
}

export function generatorArmstrong(){
    let seq=armstrongNumber();
    console.log(seq.next().value);
}

