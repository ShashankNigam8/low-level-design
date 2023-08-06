public class MyRemoteContolerInvoker {
    Command myCommand;

    public MyRemoteContolerInvoker(Command myCommand) {
        this.myCommand = myCommand;
    }

    public MyRemoteContolerInvoker() {

    }

    public void setMyCommand(Command command){
        this.myCommand = command;
    }

    public void pressButton(){
        myCommand.execute();
    }
}
