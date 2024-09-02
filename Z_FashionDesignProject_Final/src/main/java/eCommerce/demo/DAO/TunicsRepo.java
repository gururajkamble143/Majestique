package eCommerce.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import eCommerce.demo.model.Tunics_table;

public interface TunicsRepo extends JpaRepository<Tunics_table, Integer>{

}
