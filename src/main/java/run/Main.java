package run;

import entity.Color;
import entity.IFabric;
import entity.Suit;
import exception.BadClothesException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static entity.IFabric.washFabric;

public class Main {
    public static Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        try {
            Suit s1 = new Suit(23, Color.BLUE, true);
            log.log(Level.INFO, s1);
            washFabric(s1);
        } catch (BadClothesException e) {
            log.log(Level.ERROR, e.getMessage());
        }
    }

}
