/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ticketmachine.TicketMachine;

/**
 *
 * @author mateus
 */
public class TicketMachoneTest {
    
    TicketMachine tm1 = new TicketMachine(50.0);
    Double valorInserido;
    
    @Test
    public void testInsertMoney() {
        // Compara a quantidade inserida
        valorInserido = 10.0;
        tm1.insertMoney(valorInserido);
        assertEquals(tm1.getBalanco(), valorInserido);      
        
        /**
        * Tentativa de inserir valor negativo 
        * precisa manter o valor anterior
        */
        Double valorNegativo = -10.0;
        tm1.insertMoney(valorNegativo);
        assertEquals(tm1.getBalanco(), valorInserido);
    }

    @Test
    public void testEmpty() {
        valorInserido = 12.0;
        tm1.insertMoney(valorInserido);
    
        tm1.sangria();
        tm1.empty();
        assertEquals(tm1.getTotal(), Double.valueOf(0));
    }

    @Test
    public void testGiveChange() {
        valorInserido = 60.0;
        tm1.insertMoney(valorInserido);
        Double troco = tm1.getBalanco() - tm1.getPreco();
        assertEquals(tm1.giveChange(), troco);
    }

    @Test
    public void testRefundBalance() {
        valorInserido = 20.0;
        tm1.insertMoney(valorInserido);
        tm1.refundBalance();
        assertEquals(tm1.getBalanco(), Double.valueOf(0));
    }
}
