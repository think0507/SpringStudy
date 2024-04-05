package ac.su.fielddi.main;

import ac.su.fielddi.obj.Singer;
import ac.su.fielddi.obj.Stage;
import ac.su.fielddi.obj.Broadcast;

public class FieldDiMain {
    public static void main(String[] args) {
        // 의존 객체를 외부에서 주입했을 때 장점
        // 클래스 단위를 개발할 때에는, 생성과 의존 관계에 대해서 신경 쓸 필요가 없음
        // 개발 단계에서의 집중 분산을 막고, 관점을 분리
        // //// (1) 클래스 개별 구현 & (2) 클래스 사용 관점
        Broadcast broadcast = new Broadcast();
        broadcast.stage = new Stage();
        broadcast.stage.singer = new Singer("IU", "Love wins all");
        broadcast.startBroadcasting();
    }
}
