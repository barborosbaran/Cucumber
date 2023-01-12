
Feature: US1009 Yanlis kullanici adi ve password listesi ile negatif login testi
  Scenario Outline: TC14 yanlis kullanici listesi ile giris yapilamamali

    Given kullanici "qdUrl" sayfasina gider
    Then cookies leri kabul eder
    Then  ilk sayfa login linkine click yapar
    And  kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
    And pasword kutusuna manuel olarak "<yanlisPassword>" yazar
    And login butonuna basar
    And giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
      |yanlisUsername  | yanlisPassword|
    | ilker          |ilker@a.com    |
    |mehmet          |mehmet@B.COM   |
    |YASAR           | yasar@a.com   |
    |adem            |adem@a.com     |
    |ozgur           |Ozgur@e.com    |