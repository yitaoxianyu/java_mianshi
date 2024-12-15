package 设计模式;

public class Decorator {
    public static void main(String[] args) {

    }

    public interface component{
        void doSomeThing();
    }

    //同时实现component接口
    public class FirstRobot implements component{

        @Override
        public void doSomeThing() {

        }
    }
    //存储一个实例,并且实现功能拓展
    public class DecoratedRobot implements component{

        private FirstRobot firstRobot;

        @Override
        public void doSomeThing() {
            firstRobot.doSomeThing();
        }

        public void doMoreThing(){
            System.out.println("I can do more things");
        }

        public DecoratedRobot(FirstRobot firstRobot){
            this.firstRobot = firstRobot;
        }
    }
}
