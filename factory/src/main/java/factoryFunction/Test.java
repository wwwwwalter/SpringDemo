package factoryFunction;

import interfs.IPhone8;
import interfs.IPhonex;

public class Test {
    public static void main(String[] args) {
        LineX xLine = new LineX();
        IPhonex iPhonex = xLine.produce();
        iPhonex.play();

        Line8 line8 = new Line8();
        IPhone8 iPhone8 = line8.produce();
        iPhone8.play();
    }
}
