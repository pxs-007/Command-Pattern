package command;

import java.util.ArrayList;

public class Waiter {
    private ArrayList<Command> commands=null;
    public Waiter(){
        commands=new ArrayList<Command>();
    }
    public void SetCommand(Command cmd){
        commands.add(cmd);
    }
    public void Orderup(){
        System.out.println("有订单");
        for(Command cmd:commands){
            if(cmd!=null)
                cmd.execute();
        }
    }
}
