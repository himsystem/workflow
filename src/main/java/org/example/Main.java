package org.example;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;

public class Main {
    public static void main(String[] args) {

        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println("ok");
    }
}