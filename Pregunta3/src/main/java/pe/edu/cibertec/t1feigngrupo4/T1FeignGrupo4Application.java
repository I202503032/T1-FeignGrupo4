package pe.edu.cibertec.t1feigngrupo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1FeignGrupo4Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo4Application.class, args);
    }

}
