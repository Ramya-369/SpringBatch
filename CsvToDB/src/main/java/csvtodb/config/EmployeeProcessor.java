package csvtodb.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import csvtodb.entity.Employee;

@Component
public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {

    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }
}
