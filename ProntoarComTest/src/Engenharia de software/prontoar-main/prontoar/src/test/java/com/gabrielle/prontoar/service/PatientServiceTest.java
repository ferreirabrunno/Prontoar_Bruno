package com.gabrielle.prontoar.service;

import com.gabrielle.prontoar.entity.Patient;



import com.gabrielle.prontoar.repository.PatientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.LocalDate;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
public class PatientServiceTest {

    PatientService patientService;
    
    WebDriver webdriver;
    
    
    @BeforeAll
    public void setupAll() {
    	System.clearProperty("webdriver.chrome.driver",
    			"src\Engenharia de software\prontoar-main\prontoar\\src\test\resources\ChromeDriver\chromedriver.exe");
    }
    
    
    @BeforeEach
    public void setup() {
    	webdriver = new ChromeDriver();
    	webdriver.manage().windows().maximine();
    }
    
    @afterEach
    public void close() {
    	webdriver.close();
    }
    
   
    
    @Test
    public void opeNewPAge() {
    	webdriver.get()
    }
    
    
    @Test
    public void openProntoarPage(){
      webdriver.get("Prontoar");
      Assertions.assertEquals("Prontoar",
          webdriver.getCurrentUrl());
    }
    
    
   /*
    @Test
    public void patientTestServiceCreateReturningPatient(){
         LocalDate birthDate = LocalDate.parse("2001-11-10");

        Patient patient = new Patient("Gabrielle", "11263628273", 21, , 'F',
                "81987980601", "email@gmail.com", 65.0, 1.71, "1234");
        var createPatient = this.patientService.createPatient(patient);
        Assertions.assertEquals(patient, createPatient);

         */
    }

}
