package decorator1;

import java.util.List;

/**
 * Created by yuboyang on 6/8/17.
 */
public abstract class AbstractDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public AbstractDecorator(Decorator toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @Override
    public List getTarget() {
        return this.toBeDecorated.getTarget();
    }

    @Override
    public void excute() {
        System.out.println("AbstractDecorator test start:");
    }
}
