package hmos9c.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "hmos9c.spring.core.configuration"
})
public class ScanConfiguration {
}
