package 设计模式;

public class CommandPattern {
    public static void main(String[] args) {
        printButtonService printButtonService = new printButtonService();
        PrintButton pb = new PrintButton(new printCommand(printButtonService));
        pb.print();
    }

}

class PrintButton{
    private Command command;

    public PrintButton(Command cm){
        this.command = cm;
    }

    public void print(){
        this.command.execute();
    }
}


interface Command{
    void execute();
}

class printCommand implements Command{

    private printButtonService printButtonService;
    public printCommand(printButtonService printButtonService){
        this.printButtonService = printButtonService;
    }

    @Override
    public void execute() {
        printButtonService.print();
    }
}

class printButtonService{
    public void print(){
        System.out.println("进行打印");
    }
}

