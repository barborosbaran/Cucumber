Feature: US1014
  @wip
  Scenario: TC19 kullanici olusturabilmeli
    Given kullanici "autoUrl" sayfasina gider
    And user sign in linkine tiklar
    And user Create and account bolumunene email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin