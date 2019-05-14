package factoryFunction;

import interfs.IPhone;
import interfs.IPhone8;

public class Line8 implements BigFactory {
    @Override
    public IPhone8 produce() {
        return new IPhone8();
    }
}
