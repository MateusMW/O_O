/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmachine;

/**
 *
 * @author mateus
 */
public class Main {

    public static void main(String[] args) {
        TicketMachine tm1 = new TicketMachine(50.0);
        tm1.showPrice();                        
        tm1.insertMoney(60.0);
	tm1.printTicket();
        tm1.empty();
        
        System.out.println("");
        TicketMachine tm2 = new TicketMachine(30.0);
        tm2.showPrice();
        tm2.insertMoney(25.0);
        tm2.printTicket();
    }

   
    
}
