package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Menu;

@Repository
public interface MenuRepository extends JpaRepository <Menu, Integer> {

}
