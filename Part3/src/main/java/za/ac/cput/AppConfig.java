package za.ac.cput;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="calc")
    public CalculatorInterface getService(){
        return new CalculatorServiceImpl();
    }
}
