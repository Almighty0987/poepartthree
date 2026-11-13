/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartthree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class MessageTest {
    
    public MessageTest() {
    }

    @Test
    public void testCheckRecipientCellValid() {
        Message msg = new Message();
        String result = msg.checkRecipientCell("0831234567");
        assertEquals("Valid number", result);
    }

    @Test
    public void testCheckRecipientCellInvalid() {
        Message msg = new Message();
        String result = msg.checkRecipientCell("12345");
        assertEquals("Invalid number", result);
    }

    @Test
    public void testCreateMessageHash() {
        Message msg = new Message();
        String hash = msg.createMessageHash("1234567890", 1, "Hello world test");
        assertTrue(hash.contains("12:1:HELLOWORLD"));
    }
}