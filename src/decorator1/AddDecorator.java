package decorator1;

import java.util.List;

/**
 * Created by yuboyang on 6/8/17.
 */
public class AddDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public AddDecorator(Decorator toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @Override
    public List getTarget() {
        return this.toBeDecorated.getTarget();
    }

    @Override
    public void excute() {
        this.toBeDecorated.excute();
        this.getTarget().add(new Object());
        excuteAdd();
    }

    public void excuteAdd() {
        System.out.println("AddDecorator excute test is done");
    }
}
