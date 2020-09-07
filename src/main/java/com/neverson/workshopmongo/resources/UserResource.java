package com.neverson.workshopmongo.resources;

import com.neverson.workshopmongo.domain.User;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserResource {

    @GetMapping("")
    public ResponseEntity<List<User>> findAll() {
        User user = new User("1", "Maria Brown", "maria@gmail.com");
        User user2 = new User("2", "Alex Green", "alex@gmail.com");
        List<User> users = new ArrayList(Arrays.asList(user, user2));
        return ResponseEntity.ok(users);
    }
}
