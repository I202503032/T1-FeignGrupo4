package pe.edu.cibertec.t1feigngrupo4.restclient.rickandmorty.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CharacterRM {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Location origin;
    private Location location;
    private String image;

    @Setter
    @Getter
    public static class Location {
        private String name;
        private String url;
    }
}
