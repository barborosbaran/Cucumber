@wip
Feature: US1012 Window testi

  Scenario: TC17 kullanici yeni acilan window u test edebilmeli
    Given  kullanici "wduUrl" sayfasina gider

    Then Login Portal elementine kadar asagi iner
    And Login Portal a tiklar
    Then Acilan yeni window a gecer
    And username kutusuna deger yazar
    And password kutusuna deger yazar
    Then webunuversity login butonuna basar
    Then 2 saniye bekler
    And Popup ta cikan yazinin validation failed oldugunu test eder
    Then 2 saniye bekler
    And OK diyerek popup i kapatir
    Then ilk sayfaya geri doner
    Then 2 saniye bekler
    And ilk sayfaya dondugunu test eder
    And Tum sayfalari kapatir

