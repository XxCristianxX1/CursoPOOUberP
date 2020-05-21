function Random (fruit, matrix, ventilador, control){
    this.fruit = fruit;
    this.matrix = matrix;
    this.ventilador = ventilador;
    this.control = control;
}
Random.prototype.printDataRandom = function (){
    console.log(this.fruit)
    console.log(this.matrix)
    console.log(this.ventilador)
    console.log(this.control)
}