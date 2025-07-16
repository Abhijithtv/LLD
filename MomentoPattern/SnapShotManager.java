package MomentoPattern;

import java.util.Stack;

public class SnapShotManager {
    Stack<ISnapShot> history;

    public SnapShotManager(){
        history = new Stack<>();
    }

    public void store(ISnapShot snapShot){
        history.add(snapShot);
    }

    public ISnapShot undo(){
        return history.isEmpty() ? null : history.pop();
    }

}
