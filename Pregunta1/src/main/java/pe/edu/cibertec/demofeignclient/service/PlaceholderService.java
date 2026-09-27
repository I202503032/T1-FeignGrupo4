package pe.edu.cibertec.demofeignclient.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.iclient.UserClient;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.UserPlaceHolder;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PlaceholderService {
    private final UserClient userClient;

    public List<UserPlaceHolder> getUsersWithOddId() {
        List<UserPlaceHolder> allUsers = userClient.getAllUsers();

        // Filtrar los usuarios cuyo id sea impar
        return allUsers.stream()
                .filter(user -> user.getId() != null && user.getId() % 2 != 0)
                .collect(Collectors.toList());
    }

}
