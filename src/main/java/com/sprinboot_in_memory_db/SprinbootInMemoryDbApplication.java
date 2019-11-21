package com.sprinboot_in_memory_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.springboottutorial.com/spring-boot-and-h2-in-memory-database
 * Login in to h2 console: http://localhost:8080/h2-console and jdbc:h2:mem:testdb as JDBC URL
 * You will see that a new table called ‘student’ is created in H2 Console.
 * How did the Student table get created?
 * Its because of Spring Boot Auto Configuration.
 * Now create data.sql
 * Restart the application and you will see the data gets populated in db
 *
 * Notes:
 * If you are talking to an in memory db, by default, it looks at the entities and creates the database and the tables.
 * However, if you connect to a mysql database, Spring Boot knows that its a permanent database.
 * By default, it expects you to set up the database, set up the tables and it uses the connection that you established.
 *
 * Autoconfiguration of in memory h2 db
 * spring.datasource.url=jdbc:h2:mem:testdb
 * spring.datasource.driverClassName=org.h2.Driver
 * spring.datasource.username=sa
 * spring.datasource.password=
 *
 * spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
 * Spring Boot auto-configuration attempts to automatically configure your Spring application
 * based on the jar dependencies that you have added. For example, If HSQLDB is on your classpath,
 * and you have not manually configured any database connection beans, then Spring Boot will auto-configure an in-memory database.
 *
 * While we dont recommend this , it interesting to note that H2 has a persisted database mode
 * spring.datasource.name=yourdbname
 * spring.datasource.driverClassName=org.h2.Driver
 *
 * spring.datasource.initialize=false
 * spring.datasource.url=jdbc:h2:file:~/yourdbname;DB_CLOSE_ON_EXIT=FALSE;IFEXISTS=TRUE;DB_CLOSE_DELAY=-1;
 *
 * spring.jpa.hibernate.ddl-auto = update
 */
@SpringBootApplication
public class SprinbootInMemoryDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinbootInMemoryDbApplication.class, args);
    }

}
