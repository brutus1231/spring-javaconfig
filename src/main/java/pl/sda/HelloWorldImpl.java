package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

    @Autowired
    private Printer printer;

    public void print(String message) {
        printer.print(message);
    }
}
