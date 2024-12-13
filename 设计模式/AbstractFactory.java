package 设计模式;

public class AbstractFactory {
    public static void main(String[] args) {

    }

    public interface factory{
        phone createPhone();
        mask createMask();
    }

    public interface mask{

    }

    public interface phone{

    }

    public static class Iphone implements phone{

    }

    public static class N95 implements mask{

    }

    public static class Factory implements factory{

        @Override
        public phone createPhone() {
            return new Iphone();
        }

        @Override
        public mask createMask() {
            return new N95();
        }
    }
}
