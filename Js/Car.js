class Car {
    id = int
    license = str
    passenger = int
    driver = str
    
    constructor(license, driver, passenger) {
        this.id;
        this.license = license;
        this.passenger = passenger;
        this.driver = driver;
    }
    printDataCar() {
        console.log(this.license);
        console.log(this.passenger);
        console.log(this.driver);
    }
}


