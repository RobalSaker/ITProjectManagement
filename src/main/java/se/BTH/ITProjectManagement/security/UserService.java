package se.BTH.ITProjectManagement.security;


import se.BTH.ITProjectManagement.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}