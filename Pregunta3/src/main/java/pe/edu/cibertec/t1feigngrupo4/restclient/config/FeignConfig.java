package pe.edu.cibertec.t1feigngrupo4.restclient.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.t1feigngrupo4.restclient.errorhandler.CustomErrorDecoder;

@Configuration
public class FeignConfig {
    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }
}
