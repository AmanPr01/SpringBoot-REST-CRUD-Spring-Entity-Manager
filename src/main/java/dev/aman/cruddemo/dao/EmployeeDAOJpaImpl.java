package dev.aman.cruddemo.dao;

import dev.aman.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    // define fields for entity manager

    private EntityManager entityManager;

    // setup constructor injection

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        // create query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        // execute query and get result list
        List<Employee> employee = theQuery.getResultList();

        // return the results
        return employee;
    }

    @Override
    public Employee findById(int theId) {

        // get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {     // This method is for add/update.

        // save employee
        Employee dbEmployee = entityManager.merge(theEmployee);    // if id == 0, then insert/save else update

        // return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {

        // find employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // remove employee
        entityManager.remove(theEmployee);
    }
}











