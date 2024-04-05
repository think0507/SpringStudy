package ac.su.setterdi.main;

import ac.su.setterdi.obj.*;

public class SetterDiMain {
    public static void main(String[] args) {
        // fieldDI 에 비해서 반복적 코드가 많이 발생하는 단점
        // 하지만 객체지향적으로 encapsulation 을 지킬 수 있다.
        Broadcast broadcast = new Broadcast();
        Stage stage = new Stage();
        Singer singer = new Singer("Ariana Grande", "senorita");
        broadcast.setStage(stage);
        stage.setSinger(singer);
        broadcast.startBroadcasting();
    }
}
