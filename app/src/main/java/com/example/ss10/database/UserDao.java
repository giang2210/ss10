package com.example.ss10.database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface UserDao {

    @Insert
    long insertUser(User user);

    @Update
    int updateUser(User user);

    @Delete
    int deleteUser(User user);

    @Query("Select * from user where id = :id")
    User findUser(int id);

    @Query("Select * from user")
    List<User> getAllUser();
}
