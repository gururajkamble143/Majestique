package eCommerce.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import eCommerce.demo.model.Registration_table;

public interface RegistrationRepo extends JpaRepository<Registration_table, Integer>{

}
