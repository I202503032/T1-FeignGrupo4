package pe.edu.cibertec.demofeignclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.UserPlaceHolder;
import pe.edu.cibertec.demofeignclient.service.PlaceholderService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/placeholder")
@RestController
public class PlaceholderController {
    private final PlaceholderService placeholderService;

    // GET para Postman: http://localhost:8080/api/v1/placeholder/users-odd
    @GetMapping("/users-odd")
    public ResponseEntity<List<UserPlaceHolder>> getFilteredUsers() {
        List<UserPlaceHolder> users = placeholderService.getUsersWithOddId();
        return ResponseEntity.ok(users);
    }
}
