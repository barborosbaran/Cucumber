


Feature: US1003 kullanici parametre olarak girilen degerleri aratir

@P1
  Scenario: TC03 Kullanici Parametreli metod ile Nutella Aratir

    Given kullanici amazon anasayfaya gider
    Then 2 saniye bekler
    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder


@p2
  Scenario: TC04 Kullanici Parametreli metod ile Java Aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder


  Scenario: TC04 Kullanici Parametreli metod ile Java Aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin "Samsung" icerdigini test eder
