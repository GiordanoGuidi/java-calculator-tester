package TrainTicket;

public class Ticket {
    //Attributi
    int kilometers;
    int passengerAge;
    //Costruttori
    public Ticket(int kilometers, int passengerAge) {
        if (kilometers <=0 ){
            throw new IllegalArgumentException("Kilometers must be a number > 0: " + kilometers);
        }
        this.kilometers = kilometers;
        if (passengerAge <=0 || passengerAge > 130){
            throw new IllegalArgumentException("Age must be positive number < 130:" + passengerAge);
        }
        this.passengerAge = passengerAge;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerName(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    //Metodi
    public double getTicketPrice(){
        double totalPrice = 0.21 * kilometers;
        //controllo se il passeggero è minorenne
        if (passengerAge < 18) {
            double discount = totalPrice * 20 / 100;
            totalPrice = totalPrice - discount;
        }
        //controllo se il passeggero è over 65
        else if (passengerAge > 65) {
            double discount = totalPrice * 40 / 100;
            totalPrice = totalPrice - discount;
        }
        return  totalPrice;
    }
}
