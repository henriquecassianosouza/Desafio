
@datepicker
Feature: DatePicker
  Eu como usuario
  Quero automatizar os dois calendarios
  Para selecionar minha data de aniversario

  
  Scenario: DatePickers
    Given que eu esteja na aba de datepicker
    When selecionar meu aniversario no primeiro calendario
    And no segundo calendario 
    Then tiro uma evidencia 
    And fecho o site

  
 