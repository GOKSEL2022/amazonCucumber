@amazon_anasayfa
Feature: TC01
  Background: kullanici_anasayfayi_goruntuler
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular

    Scenario: search_alani
      And   kullanici search alaninda nokia aratir
      When  kullanici arama sonuclarinda nokia gorundugunu dogrular
      Then  kullanici sayfayi kapatir

      Scenario: dil secimi
        Given kullanici dil alanina gelir
        When  kullanici dil olarak Deutsch secer
        Then  kullanici sayfayi kapatir