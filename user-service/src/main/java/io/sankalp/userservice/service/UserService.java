package io.sankalp.userservice.service;

import io.sankalp.userservice.dto.Department;
import io.sankalp.userservice.dto.ResponseObject;
import io.sankalp.userservice.entity.User;
import io.sankalp.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser ( User user ) {
        return repository.save ( user );
    }

    public User findUserById ( Long userId ) {
        return repository.findByUserId ( userId );
    }

    public ResponseObject findUserDetail ( Long userId ) {
        ResponseObject response = new ResponseObject ();

        User user = findUserById( userId );
        Department department = restTemplate.getForObject ( "http://localhost:8080/departments/" + user.getDepartmentId(),
                Department.class);

        response.setUser ( user );
        response.setDepartment ( department );

        return response;
    }

}
