package home.learn.authtest.comp;

import org.springframework.stereotype.Component;


public class Guest implements User{

    @Override
    public String display() {
        return "I am just Guest";
    }
}
