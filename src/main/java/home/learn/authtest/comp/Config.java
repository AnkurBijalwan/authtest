package home.learn.authtest.comp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    @Primary
    public User getAdmin(){
        return new Admin();
    }

    @Bean
    public User getGuest(){
        return new Guest();
    }
}
