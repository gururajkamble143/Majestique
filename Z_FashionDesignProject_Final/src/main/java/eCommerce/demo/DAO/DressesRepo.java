package eCommerce.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import eCommerce.demo.model.Dresses_table;


public interface DressesRepo extends JpaRepository<Dresses_table, Integer>{

}
