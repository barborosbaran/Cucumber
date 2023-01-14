
Feature: US1004 Kullanici bastaki ortak adimlar icin Background kullanir

  Background: tum senaryolar icin ortak ilk adim
    Given kullanici amazon anasayfaya gider
  Scenario: TC03 Kullanici Parametreli metod ile Nutella Aratir


    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder



  Scenario: TC04 Kullanici Parametreli metod ile Java Aratir


    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder


  Scenario: TC04 Kullanici Parametreli metod ile Java Aratir


    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin "Samsung" icerdigini test eder
