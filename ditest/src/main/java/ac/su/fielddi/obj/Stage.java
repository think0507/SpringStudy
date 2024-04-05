package ac.su.fielddi.obj;

public class Stage {
    // 필드 로드시 의존성 해결
    public Singer singer;

    public Stage() {
        System.out.println("Stage is ready");
    }

    public void performance() {
        singer.sing();
    }
}
