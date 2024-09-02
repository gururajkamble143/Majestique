package eCommerce.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import eCommerce.demo.model.Shirts_table;

public interface ShirtsRepo extends JpaRepository<Shirts_table, Integer>{

}
