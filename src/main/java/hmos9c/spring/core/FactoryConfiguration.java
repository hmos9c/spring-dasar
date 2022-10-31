package hmos9c.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import hmos9c.spring.core.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
