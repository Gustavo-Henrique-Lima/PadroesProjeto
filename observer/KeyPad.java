package observer;
import java.util.Random;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad 
{
    private final PhoneModel model;
    
    public KeyPad(PhoneModel model) 
    {
        this.model = model;
    }
    public void simulateKeyPresses(int numKeyPresses) 
    {
    	Screen screen = new Screen(model);
    	Screen screen2=new Screen(model);
        final int MAX_DIGIT = 12;
        model.addObservador(screen);
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) 
        {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressing: " + newDigit);
            model.addDigit(newDigit);
        }
        model.addObservador(screen2);
    }
}