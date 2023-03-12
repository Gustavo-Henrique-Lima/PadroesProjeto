package observer;
import java.util.Random;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad 
{
    private final PhoneModel model;
    private final Screen screen;
    
    public KeyPad(PhoneModel model,Screen screen) 
    {
        this.model = model;
        this.screen=screen;
    }
    public void simulateKeyPresses(int numKeyPresses) 
    {
        final int MAX_DIGIT = 12;
        screen.addObservador(model);
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) 
        {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressing: " + newDigit);
            model.addDigit(newDigit);
        }
        if(model.getDigits().size()>8)
        {
        	System.out.println(screen.discando(model.getDigits()));
        }
    }
}