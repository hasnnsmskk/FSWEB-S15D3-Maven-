package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "Ahmet", "Yılmaz"));
        employees.add(new Employee(2, "Ayşe", "Demir"));
        employees.add(new Employee(1, "Ahmet", "Yılmaz"));
        employees.add(new Employee(3, "Mehmet", "Çelik"));
        employees.add(new Employee(2, "Ayşe", "Demir"));
        employees.add(new Employee(4, "Hasan", "Şimşek"));
        employees.add(new Employee(5, "Kaan", "Paksoy"));
        employees.add(new Employee(6, "Selin", "Başaran"));

    }

    public static List findDuplicates(List input) {
       List duplicate = new ArrayList<>(input);
       List repeaters = new ArrayList<>();
       List unique = new ArrayList<>();

       for(Object emp : duplicate) {
           if(emp == null){
               break;
           }
           if(!unique.contains(emp)){
               unique.add(emp);
           } else {
               repeaters.add(emp);
           }
       }
       return repeaters;
    }

    public static Map findUniques(List input){
        List duplicate = new LinkedList(input);
        Set<Employee> uniqueSet = new HashSet<>();
        Map<Integer, Employee> uniqueMap = new HashMap<>();

        for (Object emp : duplicate) {
            if(emp == null){
                break;
            }
            uniqueSet.add((Employee) emp);
        }

        int id = 1;
        for (Employee emp : uniqueSet) {
            uniqueMap.put(id, emp);
            id++;
        }


        return uniqueMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> input){
        List<Employee> uniqueRecords = new LinkedList<>();

        for(Employee emp : input){
            if(emp == null){
                break;
            }
            if(!uniqueRecords.contains(emp)){
                uniqueRecords.add(emp);
            } else{
                uniqueRecords.remove(emp);
            }
        }
        return uniqueRecords;

    }

}

