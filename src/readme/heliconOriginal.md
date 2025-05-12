---
📌 Título: Trilha de Helicon  
🏁 Evento: Maratona InterFatecs 2025  
👨‍💻 Autor: Lucas  
🧠 Paradigma: Força bruta com simulação  
🧑‍🏫 Nível: Intermediário  
🧪 Linguagem: Java  

📝 Descrição: >
  Dada uma trilha com `n` segmentos contendo valores inteiros (positivos ou negativos), 
  você deve simular todas as possibilidades de caminhar sobre a trilha, 
  partindo de diferentes posições iniciais e utilizando saltos de tamanho variável. 
  O objetivo é encontrar a maior soma possível de elementos visitados durante esse trajeto.

🔢 Entrada:
  - n: int → número de segmentos da trilha  
  - vet: int[] → vetor com os valores dos segmentos (separados por espaço em uma única linha)

🎯 Saída:
  - int → maior soma possível seguindo as regras de saltos

📏 Restrições:
  - 1 ≤ n ≤ 10⁵  
  - -1000 ≤ vet[i] ≤ 1000  

🧠 Lógica da Solução:
  - Testa todas as posições iniciais de 0 até n/2 - 1  
  - Para cada posição, testa todos os valores de salto k de 1 até n/2 - 1  
  - Para cada combinação (posição inicial, salto), percorre a trilha somando os valores  
  - Atualiza o valor da maior soma encontrada  
  - Imprime a maior soma ao final  

📚 Exemplo de Entrada:
8
1 2 3 4 5 6 7 8

📤 Exemplo de Saída:
20
