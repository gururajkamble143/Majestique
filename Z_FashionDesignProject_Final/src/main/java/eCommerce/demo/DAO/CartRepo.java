package eCommerce.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import eCommerce.demo.model.Cart_table;

public interface CartRepo extends JpaRepository<Cart_table, Integer>{

}
