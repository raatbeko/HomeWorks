package service;

import models.UserLogsModel;
import models.UserModel;

public interface UserService {
    boolean addUser(UserModel user);

    UserModel getUserByName(String userName);

    UserModel getUser(Long id_user);

    void unlockingUser(UserModel user, UserLogsModel userLogsModel);

    boolean deleteUser(Long id);
}
