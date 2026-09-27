package pe.edu.cibertec.demofeignclient.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.demofeignclient.restclient.config.FeignConfig;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.UserPlaceHolder;

import java.util.List;

@FeignClient(name = "placeholderUserClient", url = "https://jsonplaceholder.typicode.com",
        configuration = FeignConfig.class)

public interface UserClient {
    @GetMapping("/users")
    List<UserPlaceHolder> getAllUsers();
}
