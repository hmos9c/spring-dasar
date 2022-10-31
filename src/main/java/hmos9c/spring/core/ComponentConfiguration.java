package hmos9c.spring.core;

import hmos9c.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
    "hmos9c.spring.core.repository",
    "hmos9c.spring.core.service",
    "hmos9c.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
