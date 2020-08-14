package com.password.main.repository;
import com.password.main.model.Password;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordRepository extends JpaRepository<Password, Integer> {

    public Password findByEmployeeId(int employee_id);

}
