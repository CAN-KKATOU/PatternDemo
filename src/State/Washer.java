package State;

import java.util.Arrays;
import java.util.Iterator;

public class Washer extends StateMachine {

    private int i = 0;

    private Iterator<StateInterface> states =
            Arrays.asList(
                    new Wash(), new Spin(), new Rinse(), new Spin()
            ).iterator();

    public Washer() {
        runAll();
    }

    @Override
    protected boolean changeState() {
        if (!states.hasNext())
            return false;
        curState = states.next();
        return true;
    }
}
