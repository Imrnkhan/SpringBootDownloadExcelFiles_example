# SpringBootDownloadExcelFiles_example

<h1>Spring Boot Download Excel Files example</h1>


Spring Boot Rest API: Download Excel File.


Technology

Java 8
Spring Boot 2 (with Spring Web MVC)

Maven 3.6.1

Apache POI 4.1.2

Create a Spring Boot Application that provides APIs for downloading MySQL table data as Excel file.


If you send request to /api/excel/download, the server will return a response with an Excel file.

First of add on some Item on database and getting response after that on Excel sheet.

http://localhost:8088/api/excel/download


![img.png](img.png)



![img_1.png](img_1.png)




Create Controller for Excel File Download

In controller package, we create ExcelController class for Rest Apis.

– @CrossOrigin is for configuring allowed origins.

– @Controller annotation indicates that this is a controller.

– @GetMappinggetFile() method.

– We also use @Autowired to inject implementation of ExcelService bean to local variable.



Today we’ve built a Rest API using Spring Boot to download Excel file that contains table data in MySQL database
