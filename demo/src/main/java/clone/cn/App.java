package clone.cn;

/**
 * Hello world!
 *
 */
public class App implements Cloneable{
    int a;

    public App(int a) {
        this.a = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
