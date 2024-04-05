package ac.su.ditest.main;

import ac.su.ditest.DitestApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DitestApplication.class)
public class ApplicationConfig {
}
