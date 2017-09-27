package decorator1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuboyang on 6/8/17.
 */
public class LinkedListProfiler extends Decorator{

    @Override
    public List getTarget() {
        return new ArrayList();
    }

    @Override
    public void excute() {
        System.out.println("ArrayList test start:");
    }
}
