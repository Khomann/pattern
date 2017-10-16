JOGO UTILIZANDO DESIGN PATTERNS

Este exemplo foi desenvolvido para fins de estudo e aprendizado sobre Design Patter. Para desenvolvimento deste exemplo foi utilizado 4 pattern, foram eles PROXY, COMPOSITE, STRATEGY, STATE. Abaixo se encontra uma breve descrição de onde foram utilizados os Pattern descritos acima.

JOGO

O sistema é um exemplo de um jogo onde tem um personagem que realiza alguns movimentos dependendo de sua situação, podendo ser um personagem do tipo normal ou super. Normal ele realiza movimentos simples e Super realiza movimentos especiais. Possui tambem uma loja de equipamentos que permite comprar equipamentos unitarios ou um combo de equipamentos.

DESIGN PATTERN PROXY

O PROXY é utilizado como objetivo de encapsular um objeto através de outro objeto que possui a mesma interface fazendo assim que ele seje chamado antes do objeto real. Neste exemplo o PROXY foi utilizado para autenticação e verificação, ou seja, é verificado o tipo de personagem se é ‘Normal’ quando o personagem se movimenta sem nenhuma habilidade em especial ou ‘Super’ quando o personagem ganha habilidades especiais como pular mais alto ,correr mais rapido, andar mais rapido e atirar mais rapido e com um maior dano.

DESIGN PATTERN STATE

Aplicando o State, devemos separar cada comportamento em uma classe representando o estado atual. Classes pequenas, coesas e bem definidas. Qualquer futura alteração poderá ser executada facilmente, assim como a adição de novos comportamentos. Desta maneira, fica fácil de trabalharmos com o fluxo de estados e suas regras de negócio. No projeto foi utilizado para os estados do personagem se ele esta andando, pulando, atirando ou correndo.

DESIGN PATTERN COMPOSITE

A ideia do COMPOSITE é montar uma árvore onde tanto as folhas (objetos individuais) quanto os compostos (grupos de objetos) sejam tratados de maneira igual. Neste exemplo foi utilizado para montar os produtos, o qual será utilizado na Loja de Equipamentos onde temos:
produtoC = produtoA + produtoB;
produtoD = produtoC + produtoA;

DESIGN PATTERN STRATEGY

O STRATEGY permite que o algoritmo varie independentemente dos clientes que o utilizam, além disso, é possivel alterar seu comportamento em tempo de excução. No projeto do jogo foi aplicado para executar relatorios de quantidade de inimigos mortos pelo personagem.
