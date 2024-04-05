package ac.su.ditest.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Broadcast {
    // @Autowired
    private Stage stage;

//    @Autowired
//    public void setStage(Stage stage) {
//        this.stage = stage;
//    }

    public Broadcast() {
        System.out.println("Broadcast is ready");
    }

    @Autowired
    public Broadcast(Stage stage) {
        System.out.println("Broadcast is ready");
        this.stage = stage;
    }

    public void startBroadcasting() {
        stage.performance();
    }
}
