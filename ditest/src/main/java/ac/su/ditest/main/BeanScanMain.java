package ac.su.ditest.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ac.su.ditest.obj.*;

public class BeanScanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ApplicationConfig.class);
        // Singer singer = new Singer();

        // Component 불러온 결과 확인 - singer 객체
        //Singer singer = (Singer) context.getBean("singer");
        //singer.sing();

        // 의존성에 대한 주입이 제대로 수행되는지 확인하려면?
        //     => 의존성을 해소하지 않고 그냥 메서드 수행해 보면 됨
        Broadcast broadcast = (Broadcast) context.getBean("broadcast");
        broadcast.startBroadcasting();
    }
}
