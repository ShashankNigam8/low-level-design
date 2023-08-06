public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();

        MyRemoteContolerInvoker myRemoteContolerInvoker = new MyRemoteContolerInvoker();

        myRemoteContolerInvoker.setMyCommand(new TurnOnACCommand(airConditioner));

        myRemoteContolerInvoker.pressButton();

        myRemoteContolerInvoker.setMyCommand(new TurnOffACCommand(airConditioner));

        myRemoteContolerInvoker.pressButton();
    }
}
