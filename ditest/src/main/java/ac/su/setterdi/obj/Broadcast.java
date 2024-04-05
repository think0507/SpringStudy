package ac.su.setterdi.obj;

public class Broadcast {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Broadcast() {
        System.out.println("Broadcast is ready");
    }

    public void startBroadcasting() {
        stage.performance();
    }
}
