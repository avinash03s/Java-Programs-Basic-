package Java_8_feature.SolvingRealTimeQueries.customer;


import java.util.*;
import java.util.stream.Collectors;

public class CustomerQuestionMethods {

    static void question1(){
        /// How many male and female Customer are there in the organization?
        List<Customer> list = Customer.getCustomer();
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Customer::getGender, Collectors.counting()));
        System.out.println(collect);
    }

    static void question2(){
        /// Print the name of all Products in the organization?
        List<Customer> list = Customer.getCustomer();
        list.stream().map(Customer::getProductName).distinct().forEach(System.out::println);
    }

    static void question3(){
        ///  What is the average age of male and female Customer?
        List<Customer> list = Customer.getCustomer();
        Map<String, Double> collect = list.stream()
                .collect(Collectors.groupingBy(Customer::getGender, Collectors.averagingInt(c->c.getAge())));
        System.out.println(collect);
    }

    static void question4(){
        /// Get the details of highest age Customer in the organization?
        List<Customer> list = Customer.getCustomer();
        Optional<Customer> collect = list.stream()
                .max(Comparator.comparingDouble(c -> c.getAge()));
        System.out.println(collect);

    }

    static void question5(){
        ///Get the names of all employees who have joined after 2015?
        List<Customer> list = Customer.getCustomer();
        list.stream().filter(c->c.getVisitYear() > 2015).map(c->c.getName())
                .forEach(System.out::println);
    }

    static void question6(){
        /// Count the number of Customer of each Product
        List<Customer> list = Customer.getCustomer();
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Customer::getProductName, Collectors.counting()));
        for (Map.Entry<String ,Long> m : collect.entrySet()){
            System.out.println(m);
        }
    }

    static void question7(){
        /// Count the number of employees in each department?
        List<Customer> list = Customer.getCustomer();
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Customer::getName, Collectors.counting()));
        for (Map.Entry<String ,Long> m: collect.entrySet()){
            System.out.println(m);
        }
    }

    static void question8(){
        /// What is the average age of each department?
        List<Customer> list = Customer.getCustomer();
        Map<String , Double> collect = list.stream().collect(Collectors.groupingBy(Customer::getProductName, Collectors.averagingDouble(Customer::getAge)));
        System.out.println(collect);
    }

    static void question9(){
        /// Get the details of youngest male Customer in the product is BOAT?
        List<Customer> list = Customer.getCustomer();
        Optional<Customer> min = list.stream().filter(c -> c.getGender().equals("Male"))
                .filter(c -> c.getProductName().equals("BOAT"))
                .min((a,b)->a.getAge()-b.getAge());
        System.out.println(min);
    }

    static void question10(){
        /// Who has the most age (most experience) in the organization?
        List<Customer> list = Customer.getCustomer();
        Optional<Customer> first = list.stream().sorted((a, b) -> b.getAge() - a.getAge()).findFirst();
        System.out.println(first);
    }
}
