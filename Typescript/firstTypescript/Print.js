var circle = {
    print: function () { return console.log("Circle has printed!!"); }
};
var employee = {
    print: function () { return console.log("Employee has printed!!"); }
};
function PrintAll(circle, employee) {
    circle.print();
    employee.print();
}
PrintAll(circle, employee);
