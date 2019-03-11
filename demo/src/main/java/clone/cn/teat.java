package clone.cn;

import java.util.ArrayList;

public class teat {
    public static void main(String[] args) {
        System.out.println(getNum());
        String [] s=new String[5];
    }


    public static int getNum() {
        try {
            int a = 1 / 0;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
