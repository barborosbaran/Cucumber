
Feature: US1007 kullanici yanlis bilgilerle giris yapamaz

  Scenario: TC10 Gecerli kullanici adi ve yanlis sifre ile Negatif Login Testi
    Given kullanici "qdUrl" sayfasina gider
    Then cookies leri kabul eder
    Then ilk sayfa login linkine click yapar
    And  kullanici kutusuna "qdGecerliUsername" yazar
    And pasword kutusuna "qdGecersizPassword" yazar
    Then  login butonuna basar
    And giris yapilamadigini test eder
    And 3 saniye bekler


  Scenario: TC11 Gecersiz kullanici adi ve gecerli sifre ile Negatif Login Testi
    Given kullanici "qdUrl" sayfasina gider
    Then cookies leri kabul eder
    Then ilk sayfa login linkine click yapar
    And  kullanici kutusuna "qdGecersizUsername" yazar
    And pasword kutusuna "qdGecerliPassword" yazar
    Then  login butonuna basar
    And giris yapilamadigini test eder
    And 3 saniye bekler


  Scenario: TC12 Gecersiz kullanici adi ve yanlis sifre ile Negatif Login Testi
    Given kullanici "qdUrl" sayfasina gider
    Then cookies leri kabul eder
    Then ilk sayfa login linkine click yapar
    And  kullanici kutusuna "qdGecersizUsername" yazar
    And pasword kutusuna "qdGecersizPassword" yazar
    Then  login butonuna basar
    And giris yapilamadigini test eder
    And 3 saniye bekler
