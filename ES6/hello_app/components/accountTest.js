class Account{
    constructor(id,name,balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    get id(){
        return this._id;
    }

    set id(id){
        this._id=id;
    }

    get name(){
        return this._name;
    }

    set name(name){
        this._name=name;
    }

    get balance(){
        return this._balance;
    }

    set balance(balance){
        this._balance=balance;
    }
}

class SavingsAccount extends Account{
    constructor(id,name,balance,interest){
        super(id,name,balance);
        this.interest=interest;
    }

    get interest(){
        return this._interest;
    }

    set interest(interest){
        this._interest=interest;
    }
}

class CurrentAccount extends Account{
    constructor(id,name,balance,cash_credit){
        super(id,name,balance);
        this.cash_credit=cash_credit;
    }

    get cash_credit(){
        return this.cash_credit;
    }

    set cash_credit(cash_credit){
        this._cash_credit=cash_credit;
    }
}

let saving_1=new SavingsAccount(1,"Hemant",400000,4000);

let current_1=new CurrentAccount(1,"Hemant",200000,2000);

let saving_2=new SavingsAccount(2,"Priyamvad",300000,3000);
)