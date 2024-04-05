package ac.su.nodi.obj;

public class Stage {
    private Singer singer;

    public Stage() {
        System.out.println("Stage is ready");
        // Stage 클래스가 의존성을 직접 해결함
        this.singer = new Singer("IU", "Love wins all");
    }

    public void performance() {
        singer.sing();
    }
}
