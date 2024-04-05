package ac.su.constructordi.main;

import ac.su.constructordi.obj.*;

public class ConstructorDiMain {
    public static void main(String[] args) {
        Singer singer = new Singer("Psy", "강남스타일");
        Stage stage = new Stage(singer);
        Broadcast broadcast = new Broadcast(stage);
        broadcast.startBroadcasting();
    }
}
