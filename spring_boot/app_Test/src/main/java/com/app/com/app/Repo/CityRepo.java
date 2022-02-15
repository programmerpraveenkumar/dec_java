package com.app.com.app.Repo;

import com.app.com.app.Model.CityModel;
import com.app.com.app.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface CityRepo extends JpaRepository<CityModel,Integer> {
    @Query("select c from CityModel c where c.name=?1")
    Optional<CityModel>  getCityByName(String name);

}
