# Compilazione di file multipli in diverse posizioni del filesystem

Obiettivo: comprende come funziona `javac`, i cui file sorgenti (.java) forniti in input al comando potrebbero trovarsi in posizioni diverse del filesystem, e dove la cartella di output può essere indicata mediante opzione.

1. Si posizioni il terminale nella directory che contiene `src`
2. Si compilino, **con un solo comando**, i file `Calculator.java` e `UseCalculator.java` dentro `bin`, (quest'ultima cartella deve essere posizionata nella cartella padre di `src`)  tenendo presente che:
    - La classe `Calculator` è stata fornita in un esercizio precedente
    - ATTENZIONE: È proibito spostare i file forniti
    - NOTA: È possibile passare più file a `javac` semplicemente elencandoli
3. Si esegua `UseCalculator`

## Esercizio avanzato

- Spostare il file `Calculator.class` dalla cartella `bin`  ad una cartella `lib` in una posizione a piacere all'interno del sistema **FUORI** dalla cartella dell'esercizio.
    - Così facendo possiamo simulare il fatto che la classe `Calculator` sia una libreria offerta da terzi.
- Cancellare dunque tutti i file residui che si trovano nella cartella `bin` e il sorgente `Calculator.java` dalla cartella `src`.

Obiettivo: Lanciare un singolo comando `javac`, utilizzando la libreria che offre la classe `Calculator`, per compilare. Eseguendo la classe `UseCalculator` l'output finale dovrebbe coincidere con quello ottenuto al passo precedente.
