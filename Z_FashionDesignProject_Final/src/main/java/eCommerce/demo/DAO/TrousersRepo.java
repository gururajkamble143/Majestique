package eCommerce.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import eCommerce.demo.model.Trousers_table;


public interface TrousersRepo extends JpaRepository<Trousers_table, Integer>{

}
