package cn.myxingxing.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lixing on 17/11/3.
 */
@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
