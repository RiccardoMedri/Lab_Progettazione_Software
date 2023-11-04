# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
mkdir Es1

### Si inizializzi un repository Git dentro la cartella suddetta.
git init

### Si osservi lo stato del repository
git status

### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository
ff

### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
ff

### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
ff

### Si compili il file Java e si verifichi lo stato del repository
ff

### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
ff

### Si osservi lo stato del repository
ff

### Si crei un nuovo commit che tracci la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
ff

### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file `.gitattributes`
ff

### Si osservi la storia del repository usando `git log --all --graph`
ff

### Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`
ff

### Si crei un file Mistake.java, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
ff

### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
ff

### Si elimini `ToDelete.java` e si registri la modifica in un commit
ff

### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
ff

### Si ripristini Mistake.java dal commit identificato al passo precedente
ff

### Si rimuova il file ripristinato e si ripulisca lo stage
ff

### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
ff

### Si crei un nuovo branch di nome `experiment` e si agganci la `HEAD` al nuovo branch

### Si crei un file README.md con contenuto a piacere, e si faccia un commit che lo includa

### Si torni sul branch master e si elenchino i branch disponibili

### Si unisca il branch experiment al branch master (si faccia un merge in cui experiment viene messo dentro master, e non viceversa)

### Si osservi la storia del repository
