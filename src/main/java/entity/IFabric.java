package entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Ткань
public interface IFabric {
    public static Logger log = LogManager.getLogger();

    // Методы по умолчанию трактуются как public и abstract
    String wash();  // стирать
    String iron();  // гладить
    String dry();  // сушить

    static void washFabric (IFabric fabric) {
        log.log(Level.INFO, fabric.wash());
    }
}
