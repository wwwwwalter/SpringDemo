package abstractFactory;

import interfs.Charge;
import interfs.IPhone;
import interfs.IPhone8;
import interfs.Iphone8Charge;

public class Line8 implements BigFactory {
    @Override
    public Iphone8Charge produceCharge() {
        return new Iphone8Charge();
    }

    @Override
    public IPhone8 produceIPhone() {
        return new IPhone8();
    }
}
