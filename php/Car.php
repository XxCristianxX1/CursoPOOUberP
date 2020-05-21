<?php
class Car{
    public$id;
    public$license;
    public$driver;
    public$passenger;

    public function printDataCar (){
        echo "Licencia: $this->license" ;
    }
}
?>
