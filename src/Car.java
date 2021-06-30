class Car {
    String carModel;
    Car(String carModel){
        this.carModel = carModel;
    }
    public class Engine{
        boolean isWorking = false;
        int horsepower;
        Engine(int horsepower){
            this.horsepower = horsepower;
        }
        String startStopEngine(){
            if(isWorking == true) {
                isWorking = false;
                return "engine was stopped";
            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }
}