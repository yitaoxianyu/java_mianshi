package 设计模式;

/*
与装饰器模式和代理模式的区别为 :
装饰器模式是将功能进行拓展(实现更多的功能)
代理模式是将功能进行增强(将其中一个函数的功能进行增强)
并且二者都需要让被增强或拓展的类实现接口
*/
public class AdapterPattern {

    public static void main(String[] args) {

    }

    public class Speaker{
        public void speak(){
            System.out.println("hello everyone");
        }
    }

    public interface translator{
        void translate();
    }

    public class Adapter implements translator{

        private Speaker speaker;

        public Adapter(Speaker speaker){
            this.speaker = speaker;
        }

        @Override
        public void translate() {
            speaker.speak();
            //进行翻译
        }
    }
}
