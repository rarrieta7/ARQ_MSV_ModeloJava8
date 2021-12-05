package com.ids.fundamentos.fundamentosLiberty.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImpl implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde componente");
    }
}
