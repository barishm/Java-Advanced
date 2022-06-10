package t6_DefiningClasses.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int carsCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < carsCount; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String brand = tokens[0];
            Car car;
            if(tokens.length == 1){
                car = new Car(brand);
            }
            else{
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car = new Car(brand,model,horsePower);
            }

            System.out.println(car.carInfo());
        }
    }
}
