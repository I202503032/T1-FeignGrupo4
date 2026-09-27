package pe.edu.cibertec.t1feigngrupo4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo4.restclient.rickandmorty.model.CharacterRM;
import pe.edu.cibertec.t1feigngrupo4.service.CharacterService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/character-client")
@RestController
public class CharacterController {
    private final CharacterService characterService;

    //localhost:8080/api/v1/character-client/alive-humans
    @GetMapping("/alive-humans")
    public ResponseEntity<List<CharacterRM>> getAliveHumanCharacters() {
        return ResponseEntity.ok(characterService.getAliveHumanCharacters());
    }
}
