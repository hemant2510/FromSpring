var previousNo =Symbol("previous");
var currentNo = Symbol("current");

export class fibonacci{
  
    constructor(previous,current){
        this[previousNo]=previous;
        this[currentNo]=current;
        //console.log(typeof(currentNo));   
    }

    next(){
    [this[previousNo],this[currentNo]]=[this[currentNo],this[previousNo]+this[currentNo]];
    console.log(this[currentNo]);
    }
}

