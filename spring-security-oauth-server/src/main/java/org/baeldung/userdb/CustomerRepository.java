package org.baeldung.userdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, String> {

    @Query("SELECT cm FROM CustomerModel cm WHERE cm.enabled is true AND cm.dni = :dni")
    CustomerModel findCustomerByDni(@Param("dni") String dni);

    @Query("SELECT cm FROM CustomerModel cm WHERE cm.enabled is true AND cm.id = :id")
    CustomerModel findCustomerById(@Param("id") String id);
    
    @Query("SELECT cm FROM CustomerModel cm WHERE cm.dni = :dni")
    CustomerModel findOneByDni(@Param("dni") String dni);

}
