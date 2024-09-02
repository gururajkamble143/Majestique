package eCommerce.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import eCommerce.demo.model.Newarrival_table;


public interface NewarrivalRepo extends JpaRepository<Newarrival_table, Integer>{

}
