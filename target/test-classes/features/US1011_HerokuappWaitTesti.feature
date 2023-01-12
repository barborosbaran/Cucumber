
Feature: US1011 KullaniciHerokuapp sayfasinda butonlarin gorunur oldugunu test eder
  Scenario: TC16 kullanici bekleyerek butonlarin gorunur olmasini saglamali

    Given kullanici "herokuappUrl" sayfasina gider
    Then Add element butonuna basar
    Then Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunnu test eder
    Then Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder



