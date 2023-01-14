

Feature: US1008 Scenario Outline ile birden fazla data icintest calistirma

  Scenario Outline: TC13 Scenario outline ile amazonda arama yapilabilmeli

    #amazon anasayfaya gidelim. Nutella, Java, Samsung, ve Apple icin arama yapip
    #arama sonuclarinin aradigimiz kelimeyi icerdigini test edelim

    Given kullanici "amazonUrl" sayfasina gider
    Then  amazon arama kutusuna "<arananUrun>" yazip aratir
    And arama sonuclarinin "<arananUrun>" icerdigini test eder




    Examples:
    |arananUrun|
    | Nutella  |
    |Java |
    |Samsung|
    | Apple |