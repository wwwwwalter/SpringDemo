package abstractFactory;

import interfs.IPhone8;
import interfs.IPhonex;
import interfs.Iphone8Charge;
import interfs.IphonexCharge;

public class Test {
    public static void main(String[] args) {
        Line8 line8 = new Line8();
        Iphone8Charge iphone8Charge = line8.produceCharge();
        IPhone8 iPhone8 = line8.produceIPhone();

        LineX lineX = new LineX();
        IphonexCharge iphonexCharge = lineX.produceCharge();
        IPhonex iPhonex = lineX.produceIPhone();
    }
}
