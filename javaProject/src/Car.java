import java.util.Scanner;
import java.util.Random;
public class Car {
    String name , plateNumber , model ;
    Scanner sc = new Scanner(System.in);
    void display(){
        System.out.println("AVAILABLE CARS TO RENT \n");
        System.out.println("NAME        MODEL   PLATEUMBER      RENTAL PRICE");
        System.out.println("==================================================");
        System.out.println("1.TOYOTA      SUV     KDC 152A        Ksh.300 per hour");
        System.out.println("2.AUDI        a7      KDF 452A        Ksh.500 per hour");
        System.out.println("3.VOLKSWAGEN  CFD     KCC 452G        Ksh.300 per hour");
        System.out.println("4.SUZUKI      CX5     KDN 352Z        Ksh.250 per hour");
        System.out.println("5.lexus       V8      KBN 392R        Ksh.320 per hour");
        System.out.println("6.VOLVO       DMX     KCZ 652E        Ksh.450 per hour");
    }
}
class Customer extends Car{
    String name1,name2;
    int age;
    int idNumber;
    boolean validId = true;
    void getData(){
        display();
        do{
            System.out.printf("\nenter first name: ");
            name1 = sc.nextLine();
            System.out.printf("\nenter second name: ");
            name2 = sc.nextLine();
            System.out.printf("\nenter your age: ");
        age = sc.nextInt();
            if(age<18){
                System.out.println("YOU ARE NOT ELIGIBLE TO RENT A CAR \t\tstill under age");
            }
        }while(age<18);
        do{
        System.out.println("enter your national id number: ");
        idNumber = sc.nextInt();
        if(idNumber>=100000 && idNumber<=1000000){
            System.out.println("valid id number\n");
           validId = true;
           break;
        }else{
            System.out.println("invalid id number format\n");
            validId = false;
        }
    }while(validId != true);
        System.out.println("\n\t\t\twelcome to our car rental services dear "+name1+" "+name2+" of age "+age+" and id number "+idNumber);
    }
}
class Rental extends Customer{
double hours;
double cost;
int choice;
void rentCar(){
    getData();
    System.out.println("please enter total hour(s) for renting our car>>>: ");
    hours = sc.nextDouble();
    System.out.println("select car of your choice>>>>: ");
    choice = sc.nextInt();
    switch(choice){
        case 1:
        System.out.println("TOYOTA      SUV     KDC 152A");
        cost = hours*300;
        System.out.println("total cost for the stated period is "+cost);
        break;
        case 2:
        System.out.println("AUDI        a7      KDF 452A");
        cost = hours*500;
        System.out.println("total cost for the stated period is "+cost);
        break;
        case 3:
        System.out.println("VOLKSWAGEN  CFD     KCC 452G");
        cost = hours*300;
        System.out.println("total cost for the stated period is "+cost);
        break;
        case 4:
        System.out.println("SUZUKI      CX5     KDN 352Z");
        cost = hours*250;
        System.out.println("total cost for the stated period is "+cost);
        break;
        case 5:
        System.out.println("lexus       V8      KBN 392R ");
        cost = hours*320;
        System.out.println("total cost for the stated period is "+cost);
        break;
        case 6:
        System.out.println("lexus       V8      KBN 392R ");
        cost = hours*450;
        System.out.println("total cost for the stated period is "+cost);
        break;
        default:
        System.out.println("sorry that car is not available!!!");
        break;
    }

}
        public static void main(String[] args){
        Rental rental = new Rental();
        rental.rentCar();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        int lenght = 5;
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<lenght ; i++){
            int randomIndex = (int)(Math.random()*characters.length());
            sb.append(characters.charAt(randomIndex));
        }
        System.out.println("your unique code is: "+sb.toString());
}
}

