package ac.su.fielddi.obj;

public class Broadcast {
    // 필드 로드시 생성자 호출 및 의존성 제어 수행
    public Stage stage;

    public Broadcast() {
        System.out.println("Broadcast is ready");
    }

    public void startBroadcasting() {
        stage.performance();
    }
}
