package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

    @Autowired                  //wstrzykniecie po polu
    private Printer printer;

    //TODO po konstruktorze autowired zamiast po polu

    public void print(String message) {
        printer.print(message);
    }
}
