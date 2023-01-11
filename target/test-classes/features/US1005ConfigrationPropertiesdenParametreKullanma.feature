
Feature: US1005 Kullanici Configuration.propertiesde yazilan datalari parametre olarak kullanir
# 3 Scenario olusturup, amazon,wisequarter ve walmart anasayfalarina gidin
# ve o anasayfalara gittigimizi test edin
# parametre olarak kullandigimiz kelimeler direk testte kullanilacak datalar olabilecegi gibi
# configuration.properties'de bulunan key'ler de olabilir
# Bu durumda stepdefinition'da yolladigimiz key ile
# ConfigReader'daki getProperty() kullanilip
# configuration.properties dosyasindaki value testte kullanilabilir

  Scenario: TC06 kullanici amazon sitesine gidisi test eder
    Given kullanici "amazonUrl" sayfasina gider
    Then  url de "amazon" oldugunu test eder
    And  sayfayi kapatir

  Scenario: TC06 kullanici wisequarter sitesine gidisi test eder
    Given kullanici "wisequarterUrl" sayfasina gider
    Then  url de "wisequarter" oldugunu test eder
    And  sayfayi kapatir

  Scenario: TC06 kullanici walmart sitesine gidisi test eder
    Given kullanici "walmartUrl" sayfasina gider
    Then  url de "walmart" oldugunu test eder
    And  sayfayi kapatir