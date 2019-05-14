package staticproxy;

import interfs.Beauty;
import interfs.Love;

/**
 * 静态代理
 * 功能类似适配器类
 */
public class Proxy implements Beauty {

    private Love love;

    public Proxy(Love love) {
        this.love = love;
    }

    @Override
    public void eat() {
        love.eat();
    }

    @Override
    public int gift(int count, int f) {
        love.gift(count, f);
        return count;
    }
}
