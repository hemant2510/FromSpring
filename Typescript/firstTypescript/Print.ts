interface Printable{
    print: ()=> void;
}

let circle:Printable={
    print: ()=> console.log("Circle has printed!!")
}

let employee:Printable={
    print: ()=> console.log("Employee has printed!!")
}

function PrintAll(circle:Printable,employee:Printable){
    circle.print();
    employee.print();
}

PrintAll(circle,employee);