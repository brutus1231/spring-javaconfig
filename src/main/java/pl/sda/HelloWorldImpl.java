package pl.sda;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

    private final Printer printer;

    public HelloWorldImpl(@Qualifier("printerImpl") Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        printer.print(message);
    }
}
