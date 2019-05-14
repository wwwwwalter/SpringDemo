package abstractFactory;

import interfs.Charge;
import interfs.IPhone;
import interfs.IPhonex;
import interfs.IphonexCharge;

public class LineX implements BigFactory {
    @Override
    public IphonexCharge produceCharge() {
        return new IphonexCharge();
    }

    @Override
    public IPhonex produceIPhone() {
        return new IPhonex();
    }
}
