package pe.edu.cibertec.t1feigngrupo4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo4.restclient.rickandmorty.iclient.CharacterClient;
import pe.edu.cibertec.t1feigngrupo4.restclient.rickandmorty.model.CharacterRM;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CharacterService {
    private final CharacterClient characterClient;

    public List<CharacterRM> getAliveHumanCharacters() {
        return characterClient.getCharacters()
                .getResults()
                .stream()
                .filter(c -> "Alive".equalsIgnoreCase(c.getStatus()))
                .filter(c -> "Human".equalsIgnoreCase(c.getSpecies()))
                .toList();
    }
}
