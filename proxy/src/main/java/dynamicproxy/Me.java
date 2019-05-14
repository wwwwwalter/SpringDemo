package dynamicproxy;

import interfs.Beauty;
import interfs.Love;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Me {
    public static void main(String[] args) {

        Love love = new Love();

        Beauty proxy = (Beauty) Proxy.newProxyInstance(
                Love.class.getClassLoader(),
                Love.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object ret = null;
                        if ("eat".equals(method.getName())) {
                            ret = method.invoke(love, args);
                            System.out.println(ret);
                        } else if ("gift".equals(method.getName())) {
                            ret = method.invoke(love, args);
                            System.out.println(ret);
                        }
                        return ret;
                    }
                }
        );
        proxy.eat();
        proxy.gift(999,1);
    }
}
