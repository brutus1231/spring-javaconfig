package pl.sda;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

    public void print(String message) {
        System.out.println(message);
    }
}
