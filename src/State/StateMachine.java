package State;

public abstract class StateMachine {
    protected StateInterface curState;

    protected abstract boolean changeState();

    protected final void runAll() {
        while (changeState())
            curState.run();
    }
}
