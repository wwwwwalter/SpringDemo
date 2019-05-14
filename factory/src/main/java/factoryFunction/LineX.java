package factoryFunction;

import interfs.IPhone;
import interfs.IPhonex;

public class LineX implements BigFactory {
    @Override
    public IPhonex produce() {
        return new IPhonex();
    }
}
