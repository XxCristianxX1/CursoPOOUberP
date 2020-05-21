
class Route {
    constructor(id, end, start) {
        this.id = id;
        this.start = start;
        this.end = end;
        Route.prototype.printDataRoute = function () {
            console.log(this.id);
            console.log(this.start);
            console.log(this.end);
        };
    }
}
