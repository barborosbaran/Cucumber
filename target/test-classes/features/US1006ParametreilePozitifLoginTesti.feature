
Feature: US1006 Kullanici configration dosyasindaki bilgilerle login olabilmeli
  Scenario: TC09 Gecerli kullanici adi ve sifre ile Pozitif Login Testi
    Given kullanici "qdUrl" sayfasina gider
    Then cookies leri kabul eder
    Then ilk sayfa login linkine click yapar
    And  kullanici kutusuna "qdGecerliUsername" yazar
    And pasword kutusuna "qdGecerliPassword" yazar
    Then  login butonuna basar
    And basarili giris yapildigini test eder
    And 3 saniye bekler
    Then sayfayi kapatir