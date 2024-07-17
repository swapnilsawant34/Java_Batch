package com.collection.tasks_part2;

import java.util.*;

class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private Integer zipCode;

    public Address() {
    }

    public Address(String street, String city, String state, String country, Integer zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
}

class Customer {
    private Long id;
    private String name;
    private Character gender;
    private String email;
    private String contactNumber;
    private Address address;

    public Customer() {
    }

    public Customer(Long id, String name, Character gender, String email, String contactNumber, Address address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static HashMap<String, Integer> countCustomers(List<Customer> customerList) {
        HashMap<String, Integer> stateCountMap = new HashMap<>();
        for (Customer customer : customerList) {
            String state = customer.getAddress().getState();
            stateCountMap.put(state, stateCountMap.getOrDefault(state, 0) + 1);
        }
        return stateCountMap;
    }

    public static List<Customer> getSortedList(List<Customer> customerList) {
        List<Customer> sortedList = new ArrayList<>(customerList);
        Collections.sort(sortedList, new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return c1.getAddress().getState().compareTo(c2.getAddress().getState());
            }
        });
        return sortedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customerList = new ArrayList<>();

        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("Enter details for customer " + (i + 1));

            System.out.print("ID: ");
            Long id = scanner.nextLong();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Gender (M/F): ");
            Character gender = scanner.nextLine().charAt(0);

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();

            System.out.println("Enter address details:");

            System.out.print("Street: ");
            String street = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("State: ");
            String state = scanner.nextLine();

            System.out.print("Country: ");
            String country = scanner.nextLine();

            System.out.print("Zip Code: ");
            Integer zipCode = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Address address = new Address(street, city, state, country, zipCode);
            Customer customer = new Customer(id, name, gender, email, contactNumber, address);
            customerList.add(customer);
        }

        // Count customers by state
        HashMap<String, Integer> stateCountMap = Customer.countCustomers(customerList);
        System.out.println("Customer count by state: " + stateCountMap);

        // Get sorted list of customers by state
        List<Customer> sortedCustomerList = Customer.getSortedList(customerList);
        System.out.println("Sorted list of customers by state:");
        for (Customer customer : sortedCustomerList) {
            System.out.println(customer.getName() + " - " + customer.getAddress().getState());
        }

        
    }
}
