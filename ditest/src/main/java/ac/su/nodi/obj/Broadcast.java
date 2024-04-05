package ac.su.nodi.obj;

public class Broadcast {
    private Stage stage;

    public Broadcast() {
        System.out.println("Broadcast is ready");
        this.stage = new Stage();
    }

    public void startBroadcasting() {
        stage.performance();
    }

    public static void broadcastBySelfConstruct() {
        // Broadcast 생성시 모든 의존성이 자체적으로 제어됨
        Broadcast broadcast = new Broadcast();
        // 모든 객체가 갖춰진 후에 아래 메서드 정상 동작
        broadcast.startBroadcasting();
    }
}
