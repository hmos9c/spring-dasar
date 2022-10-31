package hmos9c.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import hmos9c.spring.core.configuration.BarConfiguration;
import hmos9c.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
