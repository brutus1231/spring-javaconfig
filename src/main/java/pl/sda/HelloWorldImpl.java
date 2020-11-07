package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

    private final Printer printer;

    public HelloWorldImpl(Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        printer.print(message);
    }
}
