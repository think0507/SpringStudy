package ac.su.constructordi.obj;

public class Stage {
    private Singer singer;

    public Stage() {
        // 기본 생성자는 그냥 둔다
        //     -> Java Bean 규약에 따른 라이브러리 연동시 편리
        // 하지만 기본생성자를 사용하지 말아야 할 이유가 있으면 제거
        System.out.println("Stage is ready");
    }

    public Stage(Singer singer) {
        System.out.println("Stage is ready");
        this.singer = singer;
    }

    public void performance() {
        singer.sing();
    }
}
