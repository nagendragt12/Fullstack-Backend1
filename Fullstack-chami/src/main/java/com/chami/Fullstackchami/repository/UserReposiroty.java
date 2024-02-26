package com.chami.Fullstackchami.repository;

import com.chami.Fullstackchami.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiroty extends JpaRepository<User,Long> {

}
