
Feature: Cadastro
  Eu como usuario
  Quero preencher as informacoes de cadastro
  Para concluir o desafio

  @cadastro
  Scenario: Cadastro
    Given que eu esteja na pagina de cadastro
    And preencher as informacoes iniciais
    And selecionar genero e hobbie
    And informar ling skill pais e data
    And informar as senhas
    When fizer upload da foto
    Then tiro uma evidencia do cadastro completo
    And encerro o site
    

  
