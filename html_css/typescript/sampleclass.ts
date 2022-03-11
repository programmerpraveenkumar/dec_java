class Car{
    //in typescript need to declare the variable
    car_name:string;
    price:number;

    constructor(name,price){
        this.car_name = name;
        this.price = price;
    }

    printName(){
        console.log(this.car_name);
    }
    printPrice(){

    }
}

let carObj = new Car("hyundai",15000);
carObj.printName()