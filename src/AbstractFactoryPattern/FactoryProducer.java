package AbstractFactoryPattern;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice == null)
            return null;

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
