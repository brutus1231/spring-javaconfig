package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pl.sda")
public class ApplicationConfiguration {

    @Autowired
    PrinterImpl printer;

    @Bean
    public HelloWorld helloWorldBean() {
        return new HelloWorldImpl(printer);
    }
}
