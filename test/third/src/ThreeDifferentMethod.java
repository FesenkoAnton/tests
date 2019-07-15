import java.util.concurrent.atomic.AtomicInteger;

/**
 *  Given the following class;
 *                   public class IncrementSynchronize {
 *                                     private int value = 0;
 *                                     //getNextValue()
 *                   }
 * Write three different method options for getNextValue() that will return 'value++', each method needs to be synchronized in a different way.
 */
public class ThreeDifferentMethod {

    public synchronized int getNextValue() {
        return value++;
    }

    public int getNextValue() {
        synchronized (this) {
            return value++;
        }

    }

    public int getNextValue() {
        return new AtomicInteger(value).incrementAndGet();
    }

}
