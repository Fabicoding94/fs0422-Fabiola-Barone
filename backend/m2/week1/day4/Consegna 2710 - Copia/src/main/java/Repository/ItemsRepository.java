package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import models.Item;


@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {

}
