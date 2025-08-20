package Constructor;

class Cab{
    String cabNumber;
    String cabType;
    static String companyName="Ola";

    Cab(){
        System.out.println("Cab not assigned");
    }

    Cab(int cabNumber,String cabType,String companyName){

        /*System.out.println("Cab Number: "+cabNumber);
        System.out.println("Cab Name: "+cabType);
        System.out.println("Company Name: "+companyName);*/
    }

    void showDetails(){
        System.out.println("Cab Number: "+cabNumber);
        System.out.println("Cab Type: "+cabType);
        System.out.println("Company Name: "+companyName);
    }

    void calculateFare(int km){
        double Fare=15*km;
        System.out.println("Total Fare: "+Fare);
    }
}
class Driver extends Cab{
    String driveName;
    double rating;

    Driver(){
        super();
        System.out.println("Drive Assigned");
        super.showDetails();
    }

    Driver(String cabNumber, String cabType, String driveName, double rating){
        this();
        /*this.driveName=name;
        this.cabType=cabType;
        this.rating=rating;
        this.cabNumber=cabNumber;*/
        System.out.println("Cab Number: "+cabNumber);
        System.out.println("Cab Type: "+cabType);
        System.out.println("Driver Name :"+driveName);
        System.out.println("Driver rating: "+rating);
    }

    void startRide(String passengerName){
        System.out.println("Ride Started for passenger: "+passengerName);
    }

    @Override
    void showDetails() {
        System.out.println("Cab Number: "+cabNumber);
        System.out.println("Cab Type: "+cabType);
        //System.out.println("Company name: "+companyName);
        System.out.println("Drive name: "+driveName);
        System.out.println("Driver rating: "+rating);
        super.showDetails();
    }
}

public class Passenger extends Cab {
    String passengerName;
    String destination;

    Passenger(){


    }
    Passenger(String passengerName,String destination){
        super();
        //System.out.println("Passenger "+name+" "+"booked a cab to "+ destination);
        /*System.out.println(name);
        System.out.println(destination);*/
    }

    void bookCab(Cab c){
       // System.out.println("Passenger "+name + "booked a cab to "+ destination);
    }

    public static void main(String[] args) {
       // Passenger ob= new Passenger("Avinash","PuneAirPort");
        Driver d1= new Driver("MH23AS6097","TATA","Rahul",5.8);
        d1.showDetails();
      //  ob.bookCab(d1);
        //d1.startRide("Avinash");
        //d1.calculateFare(15);
    }
}
