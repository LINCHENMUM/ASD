package decorator1;

import java.util.List;

/**
 * Created by yuboyang on 6/8/17.
 */
public class RemoveDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public RemoveDecorator(Decorator toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @Override
    public List getTarget() {
        return this.toBeDecorated.getTarget();
    }

    @Override
    public void excute() {
        this.toBeDecorated.excute();
        this.getTarget().remove(0);
        excuteRemove();
    }

    public void excuteRemove() {
        System.out.println("RemoveDecorator excute test is done");
    }
}
