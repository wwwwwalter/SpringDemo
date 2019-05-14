package staticproxy;

import interfs.Beauty;
import interfs.Love;

public class Me {
    public static void main(String[] args) {

        Beauty proxy = new Proxy(new Love());
        proxy.eat();
        proxy.gift(999,1);
    }
}
