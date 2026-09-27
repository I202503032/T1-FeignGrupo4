package pe.edu.cibertec.t1feigngrupo4.restclient.rickandmorty.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CharacterResponse {
    private Info info;
    private List<CharacterRM> results;

    @Setter
    @Getter
    public static class Info {
        private Integer count;
        private Integer pages;
        private String next;
        private String prev;
    }
}
