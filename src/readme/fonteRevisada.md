---
📌 Título: Problema da Fonte
🏁 Evento: Maratona InterFatecs 2025
👨‍💻 Autor: Lucas
🧠 Paradigma: Cálculo bruto + comparação mínima
🧑‍🏫 Nível: Iniciante
🧪 Linguagem: Java

📝 Descrição: >
  Em uma aldeia com três comunidades (vale, colina e topo),
  cada morador precisa buscar água em uma fonte fazendo uma viagem de ida e volta por dia.
  Cada deslocamento entre níveis custa T minutos.
  O objetivo é determinar o melhor nível para instalar a fonte,
  de modo que o tempo total gasto por todos os moradores seja o menor possível.

🔢 Entrada:
  - T: int → tempo (em minutos) para subir ou descer um nível
  - V: int → número de moradores no Vale
  - C: int → número de moradores na Colina
  - M: int → número de moradores no Topo

🎯 Saída:
  - int → menor tempo total (em minutos) gasto por todos os moradores

📏 Restrições:
  - 0 ≤ T ≤ 100
  - 0 ≤ V, C, M ≤ 1000

🧠 Lógica da Solução:
  - ✅ Calcula o tempo total se a fonte for no **Vale**:
      - Colina: 2T por pessoa
      - Topo: 4T por pessoa
      - Fórmula: (C × T × 2) + (M × T × 4)
  
  - ✅ Calcula o tempo total se a fonte for na **Colina**:
      - Vale: 2T por pessoa
      - Topo: 2T por pessoa
      - Fórmula: (V × T × 2) + (M × T × 2)

  - ✅ Calcula o tempo total se a fonte for no **Topo**:
      - Vale: 4T por pessoa
      - Colina: 2T por pessoa
      - Fórmula: (V × T × 4) + (C × T × 2)

  - ✅ Retorna o menor valor entre os três.

📚 Exemplo de Entrada:
  - T = 1
  - V = 10
  - C = 30
  - M = 20

📤 Exemplo de Saída:
  - 240
