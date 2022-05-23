package home.learn.authtest.comp;

import org.springframework.stereotype.Component;


public class Admin implements User{

    @Override
    public String display() {
        return "I am Admin";
    }
}
