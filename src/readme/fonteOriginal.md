📌 Título: Problema da Fonte
🏁 Evento: Maratona InterFatecs 2025
👨‍💻 Autor: Lucas Bezerra de Macedo
🧠 Paradigma: Estrutura condicional
🧑‍🏫 Nível: Iniciante
🧪 Linguagem: Java

📝 Descrição: >
  Em uma aldeia com três comunidades localizadas em diferentes altitudes (vale, colina e topo),
  cada morador faz uma viagem de ida e volta por dia até uma fonte de água.
  A subida ou descida de um nível leva T minutos.
  O objetivo é escolher o melhor nível para instalar a fonte e minimizar o tempo total
  de deslocamento de todos os moradores.

🔢 Entrada:
  - T: int → tempo (em minutos) para subir ou descer um nível
  - V: int → número de moradores no Vale
  - C: int → número de moradores na Colina
  - M: int → número de moradores no Topo

🎯 Saída:
  - int → menor tempo total (em minutos) gasto por todos os moradores para buscar água

📏 Restrições:
  - 0 ≤ T ≤ 100
  - 0 ≤ V, C, M ≤ 1000

🧠 Lógica da Solução:
  - ✅ Se o **Vale** tiver mais moradores:
      - Instala a fonte no **Vale**
      - Moradores da Colina: 2T por viagem
      - Moradores do Topo: 4T por viagem
      - Total = (C × T × 2) + (M × T × 4)
  
  - ✅ Se a **Colina** tiver mais moradores **ou houver empate**:
      - Instala a fonte na **Colina**
      - Moradores do Vale: 2T
      - Moradores do Topo: 2T
      - Total = (V × T × 2) + (M × T × 2)
  
  - ✅ Se o **Topo** tiver mais moradores:
      - Instala a fonte no **Topo**
      - Moradores do Vale: 4T
      - Moradores da Colina: 2T
      - Total = (V × T × 4) + (C × T × 2)

📚 Exemplo de Entrada:
  - T = 1
  - V = 10
  - C = 30
  - M = 20

📤 Exemplo de Saída:
  - 240
