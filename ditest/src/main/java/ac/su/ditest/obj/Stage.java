package ac.su.ditest.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stage {
    // @Autowired  // private 으로 선언은 했지만, 멤버 접근을 필드 기준으로 수행함
    private Singer singer;  // 객체지향 매커니즘에서 필드 직접 접근 권장 안함

//    @Autowired
//    public void setSinger(Singer singer) {
//        this.singer = singer;
//    }

    public Stage() {
        System.out.println("Stage is ready");
    }

    @Autowired
    public Stage(Singer singer) {
        System.out.println("Stage is ready");
        this.singer = singer;
    }

    public void performance() {
        singer.sing();
    }
}
