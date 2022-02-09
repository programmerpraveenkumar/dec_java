package com.app.com.app.Repo;

import com.app.com.app.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer> {
//getusernameil
//    @Query("select um from UserModel um where um.email=?1")
////    Optional<UserModel> getUserByEmail(String email);
        @Query("select um from UserModel um where um.id=?1 and um.token = ?2")
    Optional<UserModel> getTokenByUserId(Integer userId,String token);

    @Transactional
    @Modifying
    @Query("update UserModel um set  um.token=?2 where um.id=?1")
    void updateTokenByUserId(Integer userId,String token);
}
