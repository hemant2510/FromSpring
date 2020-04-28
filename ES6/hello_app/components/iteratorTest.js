export let armstrong={
    [Symbol.iterator](){
        let num=152;
        let a=0;
        let dummy=0;
        return{
            next(){
                let flag=false;
                //console.log(num);
                while(flag==false){
                    let sum=0;
                    dummy=num;
                    //console.log(num);
                    //console.log("inside outer while");
                    while(num!=0){
                        a=num%10;
                        num=Math.floor(num/10);
                        sum=sum+Math.pow(a,);
                    }
                    console.log("Sum : ",sum);
                    console.log("Dummy ",dummy);
                    if(sum==dummy){
                        //console.log("insdie if")
                        flag=true;
                        num=dummy+1;
                        return{value:sum};
                    } 
                    else{
                        num=dummy+1;
                    }
                }
            }
        }
    }
}