package com.kayquelopes.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayquelopes.workshopmongo.domain.User;
import com.kayquelopes.workshopmongo.dto.UserDTO;
import com.kayquelopes.workshopmongo.repository.UserRepository;
import com.kayquelopes.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {

        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }

    public void delete(String id) {
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(User user) {

        User newUser = findById(user.getId());
        updateData(newUser, user);
        return userRepository.save(newUser);
    }

    public void updateData (User newUser, User user){
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());

        
    }

    public User fromDTO(UserDTO ObjDTO) {
        return new User(ObjDTO.getId(), ObjDTO.getName(), ObjDTO.getEmail());
    }

}
