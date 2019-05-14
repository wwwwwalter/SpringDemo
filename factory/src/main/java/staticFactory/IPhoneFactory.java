package staticFactory;

import interfs.IPhone;
import interfs.IPhone8;
import interfs.IPhonex;

public class IPhoneFactory {
    public static IPhone staticFactory(String name){
        if("iphone8".equals(name)){
            return new IPhone8();
        }else if("iphonex".equals(name)){
            return new IPhonex();
        }else{
            return null;
        }
    }
}

class test{
    public static void main(String[] args) {
        IPhone iphonex = IPhoneFactory.staticFactory("iphonex");
        iphonex.play();
        IPhone iphone8 = IPhoneFactory.staticFactory("iphone8");
        iphone8.play();
    }
}
