package tn.esprit.springjasser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springjasser.entities.ERole;
import tn.esprit.springjasser.entities.Role;
import tn.esprit.springjasser.entities.User;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
