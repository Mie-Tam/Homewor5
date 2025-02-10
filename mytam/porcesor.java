package mytam;

import java .util.ArrayList;
public class porcesor {
    public static void main(String[] args) {
        ArrayList <Car>cars = new ArrayList <>();
        Car myCar  = new Car ("lamborghini",2020);
        Car myCar1 = new Car ("mazda",2019);
        Car myCar2 = new Car ("porshe",2007);
        cars.add(myCar);
        cars.add(myCar1);
        cars.add(myCar2);
    
        for (Car car : cars){
            car.display();
        }
       
        
    }
}
