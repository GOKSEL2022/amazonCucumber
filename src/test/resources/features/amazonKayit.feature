Feature: kullanici_kaydi
  Scenario Outline: kayit_islemi_senaryolari
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici account alanina gelir
    And   kullanici sign in linke tiklar
    And   kullanici create your amazon account linke tiklar
    And   kullanici your name "<yourName>" girer
    And   kullanici mobilNumber or email "<mobilNumberOrEmail>" girer
    And   kullanici password "<password>" girer
    And   kullanici reEnterPassword "<reEnterPassword>" girer
    And   kullanici continue butona tiklar
    When  kullanici hesap olusturuldugunu dogrular
    Then  kullanici sayfayi kapatir
    Examples:
      | yourName | mobilNumberOrEmail | password | reEnterPassword |

