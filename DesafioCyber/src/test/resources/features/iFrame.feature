@iframe
Feature: IFrame
  Eu como usuario 
  Quero acessar o frame 
  Para escrever na caixa de texto

  @tag1
  Scenario: Acessando IFrame
    Given que eu esteja na pagina do frame	
    When acessar a caixa html
    Then tiro uma evidencia da tela
    