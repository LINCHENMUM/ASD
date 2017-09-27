package decorator1;

import java.util.List;

/**
 * Created by yuboyang on 6/8/17.
 */
public abstract class Decorator {
    public abstract List getTarget();
    public abstract void excute();
}
