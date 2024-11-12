package ru.fiarr4ikdev.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fiarr4ikdev.portfolio.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
