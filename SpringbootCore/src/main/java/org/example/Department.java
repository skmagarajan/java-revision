package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Dept")
@Scope("prototype")
public class Department {

    Department(){
        System.out.println("Department Object is Created");
    }

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
