package com.password.main.model;
import javax.persistence.*;

@Entity
@Table(name = "new_hires")
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idnew_hires;
    String first_name;
    String last_name;
    @Column(name = "employee_id")
    int employeeId;
    String password;

    public int getIdnew_hires() {
        return idnew_hires;
    }

    public void setIdnew_hires(int idnew_hires) {
        this.idnew_hires = idnew_hires;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
