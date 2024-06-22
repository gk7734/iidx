package kr.hs.dgsw.iidx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IidxApplication {

    public static void main(String[] args) {
        SpringApplication.run(IidxApplication.class, args);
    }

}
