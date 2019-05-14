package abstractFactory;

import interfs.Charge;
import interfs.IPhone;

public interface BigFactory {
    Charge produceCharge();
    IPhone produceIPhone();
}
