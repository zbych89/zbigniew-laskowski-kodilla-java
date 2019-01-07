package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {
    @Autowired
    private CompanyFacade companyFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Test
    public void testEmployeeSearch(){
        //Given
        Employee employee1 = new Employee("Mark","Smith");
        Employee employee2 = new Employee("John","Smith");
        Employee employee3 = new Employee("Henry","Newman");
        Employee employee4 = new Employee("Jane","Williams");
        Employee employee5 = new Employee("Emma","Johnson");
        //When
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        employeeDao.save(employee5);
        int id1 = employee1.getId();
        int id2 = employee2.getId();
        int id3 = employee3.getId();
        int id4 = employee4.getId();
        int id5 = employee5.getId();
        List<Employee> employees = companyFacade.searchEmployees("mit");
        //Then
        Assert.assertEquals(2,employees.size());
        //Cleanup
        employeeDao.delete(id1);
        employeeDao.delete(id2);
        employeeDao.delete(id3);
        employeeDao.delete(id4);
        employeeDao.delete(id5);
    }
    @Test
    public void testCompanySearch(){
        //Given
        Company company1 = new Company("Amazon");
        Company company2 = new Company("Google");
        Company company3 = new Company("Nintendo");
        Company company4 = new Company("Lenovo");
        Company company5 = new Company("Allegro");
        //When
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
        companyDao.save(company5);
        int id1 = company1.getId();
        int id2 = company2.getId();
        int id3 = company3.getId();
        int id4 = company4.getId();
        int id5 = company5.getId();
        List<Company> companies = companyFacade.searchCompanies("ten");
        //Then
        Assert.assertEquals(1,companies.size());
        //Cleanup
        companyDao.delete(id1);
        companyDao.delete(id2);
        companyDao.delete(id3);
        companyDao.delete(id4);
        companyDao.delete(id5);
    }
}
