package ac.su.setterdi.obj;

public class Stage {
    // 필드 로드시 의존성 해결
    private Singer singer;

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Stage() {
        System.out.println("Stage is ready");
    }

    public void performance() {
        singer.sing();
    }
}
