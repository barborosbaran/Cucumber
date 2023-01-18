Feature: US1013 kullanici Web tablosunda istedigi degerin varligini test eder

  Scenario:TC18 kullanici tablodan deger test edebilmeli

    Given kullanici "guru99Url" sayfasina gider
    And guru99 cookies kabul eder
    Then Compani listesini consola yazdirir
    And "DCB Bank" in listede oldugunu test eder