package hmos9c.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import hmos9c.spring.core.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
