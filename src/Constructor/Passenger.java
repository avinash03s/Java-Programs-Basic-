/*package Constructor;

class Cab{
    String cabNumber;
    String cabType;
    String companyName;

    // default constructor
    Cab(){
        System.out.println("Cab not assigned");
    }

    Cab(String cabNumber,String cabType,String companyName){
        this();
        this.cabNumber=cabNumber;
        this.cabType=cabType;
        this.companyName=companyName;
        System.out.println("Cab Number: "+cabNumber);
        System.out.println("Cab Name: "+cabType);
        System.out.println("Company Name: "+companyName);
    }

*//*    void showDetails(){
        System.out.println("Cab Number: "+cabNumber);
        System.out.println("Cab Type: "+cabType);
        System.out.println("Company Name: "+companyName);
    }

    void calculateFare(int km){
        double Fare=15*km;
        System.out.println("Total Fare: "+Fare);
    }*//*
}
class Driver extends Cab{
    String driveName;
    double rating;

    Driver(){
        super();
        System.out.println("Drive Assigned");

    }

    Driver(String cabNumber, String cabType,String companyName, String driveName, double rating){
        this();
       this.cabNumber=cabNumber;
       this.cabType=cabType;
       this.companyName=companyName;
       this.driveName=driveName;
       this.rating=rating;
        System.out.println("Cab Number: "+cabNumber);
        System.out.println("Cab Type: "+cabType);
        System.out.println("Driver Name :"+driveName);
        System.out.println("Driver rating: "+rating);
    }

   *//* void startRide(){
        System.out.println("Ride Started for passenger: "+ "Avinash");
    }

    @Override
    void showDetails() {
        System.out.println("Cab Number: "+cabNumber);
        System.out.println("Cab Type: "+cabType);
        System.out.println("Company name: "+companyName);
        System.out.println("Drive name: "+driveName);
        System.out.println("Driver rating: "+rating);
        super.showDetails();
    }*//*
}

public class Passenger extends Cab {
    String passengerName;
    String destination;

    Passenger(){
    super();
        System.out.println("Passenger "+passengerName+" "+"booked a cab to "+ destination);


    }
    Passenger(String passengerName,String destination){
        this();
        this.passengerName=passengerName;
        this.destination=destination;

       *//* System.out.println(passengerName);
        System.out.println(destination);*//*
    }

    void bookCab(Cab c){
        System.out.println("Passenger "+passengerName + "booked a cab to "+ destination);
    }

    public static void main(String[] args) {
       Passenger ob= new Passenger("Avinash","PuneAirPort");
        Driver d1= new Driver("MH23AS6097","TATA","Rahul",5.8);
        ob.bookCab(d1);
    }
}*/
