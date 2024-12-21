package 设计模式;

//状态模式可以防止出现if-else的多层嵌套,增强代码可读性
//状态模式和策略模式的区别,内部的策略/状态改变方式不同
//状态模式由状态机本身进行不同的动作时自动发生改变,并且状态模式一般会有一个初始状态(不用指定)
//策略模式需要用户手动进行切换策略
public class StatePattern {
    public static void main(String[] args) {

    }
}

//这个类是一个状态机由当前状态和用于改变状态的行为组成
class Machine{
    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getSellState() {
        return sellState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    //这里用来表示Machine的各种状态以及当前的状态
    private State noMoneyState;
    private State sellState;
    private State hasMoneyState;
    private State soldState;

    private State currentState;

    public Machine() {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState();
        sellState = new SellState();
        soldState = new SoldState();

        currentState = this.noMoneyState;
    }

    //改变状态的动作其实都是调用此方法来进行改变的
    public void setState(State state){
        this.currentState = state;
    }

    //这里是改变状态的动作
    public void insertCoin(){
        currentState.insert();
    }


}

class NoMoneyState implements State{
    private Machine machine;

    public NoMoneyState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insert() {
        System.out.println("已经插入硬币");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void reTurn() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void dispense() {

    }
}

class HasMoneyState implements State{

    @Override
    public void insert() {

    }

    @Override
    public void reTurn() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void dispense() {

    }
}

class SellState implements State{

    @Override
    public void insert() {

    }

    @Override
    public void reTurn() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void dispense() {

    }
}
//这里表示各种状态下发生动作
class SoldState implements State{

    @Override
    public void insert() {

    }

    @Override
    public void reTurn() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void dispense() {

    }
}

//这里定义各种动作
interface State{
    void insert();
    void reTurn();
    void turn();
    void dispense();
}

