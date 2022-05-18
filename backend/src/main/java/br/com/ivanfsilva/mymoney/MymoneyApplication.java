package br.com.ivanfsilva.mymoney;

import br.com.ivanfsilva.mymoney.config.property.MymoneyApiProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MymoneyApiProperty.class)
public class MymoneyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymoneyApplication.class, args);
    }

}
