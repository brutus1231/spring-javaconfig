package pl.sda;

import org.springframework.stereotype.Component;

@Component
public class ExamplePrinter implements Printer{
    public void print(String message) {
        System.out.println(message);
    }
}
