package library.lang;

// Clone 은 기본적을 얕은 복사
public class ShallowCopy implements Cloneable {
    int[] array;


    public ShallowCopy(int[] array) {
        this.array = array;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
