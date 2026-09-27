package pe.edu.cibertec.t1feigngrupo4.restclient.rickandmorty.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo4.restclient.config.FeignConfig;
import pe.edu.cibertec.t1feigngrupo4.restclient.rickandmorty.model.CharacterResponse;

@FeignClient(name = "characterClient",
        url = "https://rickandmortyapi.com",
        configuration = FeignConfig.class
)
public interface CharacterClient {

    @GetMapping("/api/character")
    CharacterResponse getCharacters();

}
