# Projeto JavaFX com JDBC 
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

## Main View
+ CheckList:
  - Criar FXML "MainView" (package "gui")
  - Load FXML in Main
  - Update Main.java

## Main View Design:
+ Checklist:
  - Design MainView.fxml
  - Customizar itens do menu
  - Atualizar Main.java </br></br>
![Preview-Screens](https://github.com/GabrielDantas-99/Projeto-Interface-JavaFX/blob/master/imgs/mainview.png)

## Main View controller
+ CheckList:
  - Adicionar classes "util" ao projeto (Alerts.java, Constraints.java)
  - Criar About.fxml(VBox)
  - Em Main.java, expor referencia mainScene
  - Em MainViewController.java, criar método loadView 

## DepartmentList view Design:
+ Checklist:
  - Criar DepartmentList.fxml (VBox)
  - Em MainViewController.java, carregar DepartmentList
 
## DepartmentList controller 
+ Checklist: 
  - Criar model.entities.Department.java 
  - Criar DepartmentListController.java 
  - Em view, associar controller, ids, events 
