# Projeto JavaFX com JDBC 

![Preview-Screens](https://github.com/GabrielDantas-99/Projeto-Interface-JavaFX/blob/master/imgs/Group%201.png)

## Objetivo Geral:
- Introduzir o desenvolvimento de aplicações JavaFX com JDBC
- Conhecer os fundamentos e a utilização das ferramentas
- Orientação a Objetos, Lambda e JAvaFX

## Criação local do Projeto:
- User libraries: JavaFX, MySQLConnector
- Run configurations -> VM arguments: --module-path C:\java-libs\javafx-sdk\lib --add-modules=javafx.fxml,javafx.controls 
- Git:
  + git init
  + git remote add origin url
  + git pull origin main

## Main
  - Main View
  - Main View Design
  - Main View controller

![Preview-Screens](https://github.com/GabrielDantas-99/Projeto-Interface-JavaFX/blob/master/imgs/mainview.png)

## Department:
  - DepartmentList view Design
  - DepartmentList controller 
  - DepartmentService 
  - DepartmentForm (dialog) design 
  - DepartmentFormController 
  - Passing a Department object to DepartmentForm view
  - Saving a new Department 
  - Update / Remove department 
  - Department ComboBox

![Preview-Screens](https://github.com/GabrielDantas-99/Projeto-Interface-JavaFX/blob/master/imgs/departamentolist.png)

## Initializing action as parameter
+ Checklist: 
  - Add a Consumer<T> parameter to loadView method 
  - After loading view, call accept from the Consumer 
  - Add a consumer instance on loadView calls 
  
## Adding database access 
+ Prerequisites: 
  - MySQL server installed and running 
  - Database created and instantiated 
  - Data access layer implemented (DAO pattern)
+ Checklist: 
  - Add model.entities.Seller.java 
  - Add db.properties do project 
  - Add data access packages to project: 
    - db 
    - model.dao 
    - model.dao.impl 
  - In DepartmentService, add DepartmentDao dependency with Factory call
  
![Preview-Screens](https://github.com/GabrielDantas-99/Projeto-Interface-JavaFX/blob/master/imgs/Group%201.png?raw=true)
 
## Observer design pattern to update tableview
  - Create interface gui.listeners.DataChangeListener 
  - In DepartmentFormController (subject) 
    - Create List<DataChangeListener> dependency with subscribe method 
    - Notify subscribers when needed 
  - In DepartmentListController (observer) 
    - Implement DataChangeListener interface 
    - Subscribe for DepartmentFormController 


## Validation exception 
- Create model.exceptions.ValidationException 
- In DepartmentFormController 
  - In getFormData method, implement verifications and throw ValidationException 
  - Implement setErrorMessages method 
  - In onBtSaveAction, catch ValidationException 

## Seller
  - SellerList
  - Seller TableView
  - SellerForm
  - Saving Seller
  
![Preview-Screens](https://github.com/GabrielDantas-99/Projeto-Interface-JavaFX/blob/master/imgs/registrolista.png)

## TextField & DatePicker
- gui.utils.Util.java 
  - formatDatePicker method 
- TextField & DatePicker attributes (Email, BirthDate, BaseSalary) 
- Label error attributes (Email, BirthDate, BaseSalary) 
- Edit SellerFormView 
- Bugfix: SellerDaoJDBC.instantiateSeller 
  obj.setBirthDate(new java.util.Date(rs.getTimestamp("BirthDate").getTime())); 
- Update: initializeNodes 
- Update: updateFormData 

## Building JAR file
+ Build JAR file 
  - Right click project name -> Export -> Java/Runnable JAR file -> Next 
  - Select Main class 
  - Select destination folder 
  - Library handling: 3rd option
+ Pack files 
  - JAR file 
  - db.properties 
  - MySQL Connector 
  - JavaFX SDK 
  - Java SDK 




