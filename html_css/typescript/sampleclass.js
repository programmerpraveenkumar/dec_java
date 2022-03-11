var Car = /** @class */ (function () {
    function Car(name, price) {
        this.car_name = name;
        this.price = price;
    }
    Car.prototype.printName = function () {
        console.log(this.car_name);
    };
    Car.prototype.printPrice = function () {
    };
    return Car;
}());
var carObj = new Car("hyundai", 15000);
carObj.printName();
