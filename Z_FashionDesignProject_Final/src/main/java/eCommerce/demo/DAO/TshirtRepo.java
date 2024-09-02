package eCommerce.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import eCommerce.demo.model.tshirts_table;


public interface TshirtRepo extends JpaRepository<tshirts_table, Integer>{

}
