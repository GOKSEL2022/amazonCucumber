@amazon_anasayfa
Feature: TC01
  Scenario: kullanici_anasayfayi_goruntuler
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    Then  kullanici sayfayi kapatir

    Scenario: search_alani
      Given kullanici url ye gider
      When  kullanici anasayfanin acildigini dogrular
      And   kullanici search alaninda nokia aratir
      When  kullanici arama sonuclarinda nokia gorundugunu dogrular
      Then  kullanici sayfayi kapatir