package com.toantester.Locators;

public class LearningLocator {

    // 1. Xpath page Login
    String email="//input[@id='email']"; // Xác định bằng thuộc tính @
    String password="//input[@name='password']"; // Xác định bằng thuộc tính @
    String remember="//label[contains(normalize-space(),'Remember me')]"; //Xác định với hàm chứa contains()
    String forgotPassword="//a[normalize-space()='Forgot Password?']"; // Xác định bằng chuỗi text()
    String login="//button[@type='submit']"; // Xác định bằng thuộc tính @

    // 2. Xpath page menu Customer
    String new_customer="//a[contains(normalize-space(),'New Customer')]"; //Xác định với hàm chứa contains()
    String import_customer="//a[normalize-space()='Import Customers']"; // Xác định bằng chuỗi text()
    String contacts="//a[contains(normalize-space(),'Contacts')]"; // Xác định bằng chuỗi text()

    // 3. Xpath page new Customer
    String company="//input[@name='company']"; // Xác định bằng thuộc tính @
    String vat_number="//input[@name='vat']"; // Xác định bằng thuộc tính @
    String phone="//input[@name='phonenumber']"; // Xác định bằng thuộc tính @
    String website="//input[@name='website']"; // Xác định bằng thuộc tính @
    String group="//div[@class='filter-option-inner-inner']"; // Xác định bằng thuộc tính @
    String currency="//div[@class='filter-option-inner-inner'][1]"; // Xác định bằng thuộc tính @
    String default_Language="//div[@class='filter-option-inner-inner'][2]"; // Xác định bằng thuộc tính @
    String address="//textarea[@name='address']"; // Xác định bằng thuộc tính @
    String city="//input[@name='city']"; // Xác định bằng thuộc tính @
    String state="//input[@id='state']"; // Xác định bằng thuộc tính @
    String zipcode="//input[@type='text']"; // Xác định bằng thuộc tính @
    String country="//div[@class='filter-option-inner-inner']"; // Xác định bằng thuộc tính @
    String save_create="//button[@class='btn btn-default save-and-add-contact customer-form-submiter'][1]"; // Xác định bằng thuộc tính @
    String save="//button[@class='btn btn-primary only-save customer-form-submiter'][2]"; // Xác định bằng thuộc tính @

    // 4. Xpath page menu Projects
    String new_project="//a[normalize-space()='New Project' and @href='https://crm.anhtester.com/admin/projects/project']"; // Xác định bằng cách sử dụng toán tử or và and
    String gratt="//i[@class='fa fa-align-left']/ancestor::a"; // Xác định với Tổ tiên Ancestor

    // 5. Xpath page new Projects
    String project_name="//input[@name='name']"; // Xác định bằng thuộc tính @
    String customer="//input[@name='name']"; // Xác định bằng thuộc tính @
    public static void main(String[] args) {

    }
}
