# Exercício 1:
1-
a) Automovel que contém as constantes NUMEROMAXIMOPRESTACOES (24) (é uma
constante provada), GASOLINA (1), FLEX (2), DIESEL (3), GAS (4) (constantes
públicas), além dos atributos modelo, cor e combustível. Os métodos, além dos
gets e sets, devem ter:
1. numeroPrestacoes que retorna o número máximo de prestações
2. valor que retorna
1. 60000 se o automóvel for a gasolina
2. 55000 se for a diesel
3. 52000 se for a gas
4. 58000 se for flex
3. ToString cuja saída deve ser: “modelo cor Movido a (tipo)”
   
b) AutomovelBasico que herda da classe Automovel e que contém os atributos booleanos
retrovisorDoPassageiro, limpadorTraseiro, radioAmFm. O construtor e os
métodos is (quando um atributo é booleano, não se usa get, mas sim
is), sets, toString e:
1. valor que retorna a soma do valor original mais
1. 1250 se o automóvel tiver retrovisor do passageiro
2. 500 se tiver limpador traseiro
3. 1500 se tiver rádio AM/FM
   
c) AutomovelDeLuxo que herda da classe AutomovelBasico e que contém os
atributos booleanos direcaohidraulica, cambioAutomatico, vidroETravaEletrica e
uma redeclaração da constante NUMEROMAXIMOPRESTACOES (36). O construtor
e os métodos is, sets, toString e:
1. Redeclaração do método numeroPrestacoes definido na classe Automovel, que retorna
o número máximo de prestações
2. valor que retorna a soma do valor da classe mãe mais
1. 2500 se o automóvel tiver direção hidráulica
2. 3000 se tiver câmbio automático
3. 1700 se tiver vidro e trava elétrica

   
2 – Fazer um aplicativo AppAutomovel, que
1. Preencha um ArrayList de 5 posições (tipo Automovel), com Automovel na primeira
posição, AutomovelBasico na segunda e terceira e AutomovelDeLuxo nas duas últimas.
2. Imprima os 5 objetos na tela, com seu valor e o número máximo de prestações.
3. Mude o câmbio de todos os Automóveis de Luxo.
4. Imprima somente os Automóveis Básicos.
5. Imprima somente os automóveis que possuem radio.
Obs. 1): Observe novamente que o vetor de Automovel aceita que se preencha-o
com Automovel, AutomovelBasico e AutomovelDeLuxo, por que?
Porque tanto AutomovelBasico quanto AutomovelLuxo são tipos de Automovel.
Isso quer dizer que ocorre polimorfismo quando um método recebe por parâmetro uma
instância da classe A, mas ao chamar o método, é possível passar instâncias de qualquer
classe herdeira de A.
