package csvtodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import csvtodb.entity.Employee;

public interface EmployeeRepo extends JpaRepository <Employee,Integer>{

}
