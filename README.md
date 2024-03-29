# Chess System Java

Jogo de Xadrez

## Introdução
Este projeto foi realizado sob a orientação do Prof. Dr. Nelio Alves durante o Curso de Java Completo na plataforma Udemy, que foi acessado através do Linkedin. O repositório contendo todas as minhas atividades realizadas durante o curso está disponível para consulta.


## Aprendizado
No que diz respeito às Classes, aprendemos sobre construtores padrões, atributos, encapsulamento, getters e setters, métodos de instância e de classe (também conhecidos como métodos estáticos), sobrecargas, e a diferença entre classes concretas e abstratas.

Quanto à Programação Orientada a Objetos, a lógica e a organização foram abordadas de forma abrangente. Isso incluiu tópicos como herança, polimorfismo, sobrescrita de métodos, injeção de dependência, associações, encapsulamento, enumerações, downcasting, upcasting, padrão de camadas, tratamento de exceções, listas, matrizes, estruturas sequenciais, estruturas repetitivas (como ‘for’ e ‘while’) e condicionais (como ‘if-else’ e ternários). Além disso, também aprendemos sobre diagrama UML, controle de versões de código e a importância de manter o código limpo. Tudo isso e muito mais foram abordados no curso.

## Design do projeto
O projeto tem duas partes: a camada do tabuleiro (Board layer) e a camada do xadrez (Chess layer). Na camada do tabuleiro, controlamos o tabuleiro e suas peças. Na camada do xadrez, agrupamos todas as peças e controlamos o jogo. Cada peça tem suas próprias regras de movimento e jogadas especiais. As coordenadas do tabuleiro são acessadas através de letras e números.
![chess-system-design (2)](https://github.com/devDouglasN/chess-system-java/assets/122110326/29b21fc3-4275-4d23-8b5a-032a6e097038)

## Ambiente de desenvolvimento e execução
O projeto foi desenvolvido na IDE Eclipse, Windows, LTS e Java OpenJDK 11. Mas pode ser executado também em versões superiores.

O programa pode ser executado diretamente do console da IDE ou na linha de comando do terminal.

Para executar diretamente no terminal, utilize o arquivo exportado do projeto chess-system-java.jar.
A tela do programa deve ser executado semelhante ao mostrado a seguir:

![ta ae chef](https://github.com/devDouglasN/chess-system-java/assets/122110326/077ed5a6-f26d-4abf-8a79-eb84513a32cb)

O turno começa com as peças Brancas (WHITE). A UI do programa solicita a entrada de origem da peça a mover (Source). Exemplo: "a2" seleciona o Peão Branco da posição A2. Confirme com ENTER e então o programa solicitará a o destino (Target) da nova posição da peça, exemplo "a4". Observe que o programa já mostra quais movimentos possíveis da peça e trata possíveis erros de movimentação. Depois de uma movimentação válida do atual jogador segue-se para o movimento do opositor, ou seja, da peça preta (BLACK). Concluída o turno, segue-se para o próximo repetindo-se a sequência. As peças capturadas são mostradas em todas a rodadas.

## Carga horária
O projeto foi guiado por 33 videos-aulas do curso, cerca de 5h45m de gravações e atividades de desenvolvimento de aproximadamente 10h, entre os dias 19 a 24 de setembro de 2022.
![wakatime-report](https://github.com/devDouglasN/chess-system-java/assets/122110326/4fb45a9e-f90c-4ca5-84cc-d5a927139ffe)

## Conteúdo: Sistema jogo de xadrez - 33 aulas - 5h45m
1. Visão geral do capítulo Sistema Jogo de Xadrez
2. Material de apoio do capítulo
3. Criando projeto e repositório Git
4. Primeira classe - Position
5. Começando a implementar Board e Piece
6. Camada Chess e imprimindo o tabuleiro
7. Colocando peças no tabuleiro
8. BoardException e programação defensiva
9. ChessException e ChessPosition
10. Pequena melhoria na impressão do tabuleiro
11. Movendo peças
12. Tratando exceções e limpando a tela
13. Movimentos possíveis de uma peça
14. Implementando movimentos possíveis da Torre
15. Imprimindo os movimentos possíveis
16. Implementando os movimentos possíveis do Rei
17. Trocando de jogador a cada turno
18. Manipulando peças capturadas
19. Lógica de xeque - PARTE 1
20. Lógica de xeque - PARTE 2
21. Lógica de xequemate
22. Contagem de movimentos das peças
23. Peão
24. Bispo
25. Cavalo
26. Rainha
27. Jogada especial Roque - PARTE 1
28. Jogada especial Roque - PARTE 2
29. Jogada especial en passant - PARTE 1
30. Jogada especial en passant - PARTE 2
31. Jogada especial promoção
32. Atualização de compliance
33. Dando um tratamento melhor para promoção

