package ac.su.constructordi.obj;

public class Broadcast {
    private Stage stage;

    public Broadcast() {
        System.out.println("Broadcast is ready");
    }

    public Broadcast(Stage stage) {
        System.out.println("Broadcast is ready");
        this.stage = stage;
    }

    public void startBroadcasting() {
        stage.performance();
    }
}
