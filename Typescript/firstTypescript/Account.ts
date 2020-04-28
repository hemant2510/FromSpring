class Accounts{
    id:number;
    name:string;
    _balance:number;

    constructor(id:number,name:string,balance:number){
        this.id=id;
        this.name=name;
        this._balance=balance;
    }

    get balance():number{
        return this._balance;
    }
}

class SavingsAccount extends Accounts{
    interest:number;

    constructor(id:number,name:string,_balance:number,interest:number){
        super(id,name,_balance);
        this.interest=interest;
    }
    get balance():number{
        return this._balance;
    }
}

class CurrentAccount extends Accounts{
    cash_credit:number;
    constructor(id:number,name:string,_balance:number,cash_credit:number){
        super(id,name,_balance);
        this.cash_credit=cash_credit;
    }
    get balance():number{
        return this._balance;
    }
}

let obj1:Accounts=new SavingsAccount(1,"Hemant Raj",400000,4000);

let obj2:Accounts=new CurrentAccount(2,"Priyamvad",2000000000,6000);

function calculateBalance(){
    let bal1:number=obj1.balance;
    let bal2:number=obj2.balance;
    let result:number=bal1+bal2;
    console.log(result);
}

calculateBalance();