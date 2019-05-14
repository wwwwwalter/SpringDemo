package interfs;

import interfs.Beauty;

public class Love implements Beauty {
    @Override
    public void eat() {
        System.out.println("love eat");
    }

    @Override
    public int gift(int count,int f) {
        System.out.println("love gift" + count);
        return count;
    }
}
