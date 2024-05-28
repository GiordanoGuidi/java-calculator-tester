package TrainTicket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    //test per controllare la validità degli attributi
    @Test
    void createValidTicket(){
        Ticket ticket = new Ticket(50,62);
        assertEquals(50,ticket.getKilometers());
        assertEquals(62,ticket.getPassengerAge());
    }
    //test per controllare la non validità dell'attributo kilometers
    @Test
    void createTicketWithInvalidKilometers(){
        assertThrows(IllegalArgumentException.class,()->new Ticket(-1,65));
        assertThrows(IllegalArgumentException.class,()->new Ticket(0,65));
    }
    //test per controllare la non validità dell'attributo passengerAge
    @Test
    void createTicketWithInvalidPassengerAge(){
        assertThrows(IllegalArgumentException.class,()->new Ticket(50,0));
        assertThrows(IllegalArgumentException.class,()->new Ticket(50,150));
    }
    //test per contollare il corretto calcolo del biglietto standard
    @Test
    void standardTicketPrice(){
        Ticket ticket = new Ticket(100,25);
        double rightPrice = 0.21 * ticket.getKilometers();
        double ticketPrice = ticket.getTicketPrice();
        assertEquals(rightPrice,ticketPrice);
    }
    //test per contollare il corretto calcolo del biglietto senior
    @Test
    void seniorTicketPrice(){
        Ticket ticket = new Ticket(100,80);
        double rightPrice = 0.21 * ticket.getKilometers() * 0.6;
        double ticketPrice = ticket.getTicketPrice();
        assertEquals(rightPrice,ticketPrice);
    }
    //test per contollare il corretto calcolo del biglietto minor
    @Test
    void minorTicketPrice(){
        Ticket ticket = new Ticket(100,15);
        double rightPrice = 0.21 * ticket.getKilometers() * 0.8;
        double ticketPrice = ticket.getTicketPrice();
        assertEquals(rightPrice,ticketPrice);
    }
}