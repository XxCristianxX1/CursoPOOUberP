function Payment(id) {
    this.id = id;

    Payment.prototype.printDataPayment = function (){
        console.log(this.id)
    }
}