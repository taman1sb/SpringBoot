package com.training.spring.demo;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        Company company = new Company();
        company.setCompanyId(100);
        company.setCompanyName("ShankerT");
        company.setActive(true);

        List<Employee> employees = new ArrayList<>();

        for(int i = 0; i<4; i++){
            Employee employee = new Employee();
            employee.setEmployeeId(i);
            employee.setEmployeeName("EMP"+i);
         employees.add(employee);
                    }
        company.setEmployees(employees);
        Gson gson = new Gson();
        System.out.println(gson.toJson(company));

      //  gson.fromJson("",Company.class);

        Company company1 = gson.fromJson(gson.toJson(company),Company.class);
      //  Company company2 = gson.fromJson("",Company.class);
        System.out.println(gson.toJson(company1));
    }
}
