package it.unibo.io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * Simple utility class that adds line numbers to files.
 */
public final class LineNumbers {

    private LineNumbers() { }

    /**
     * Processes the provided file produces a new file where each line is prefixed with its line number
     * (starting from 1).
     * The new file must have the same name of the original one, prefixed with {@code numbered-}.
     * For instance,
     * <ul>
     *     <li>{@code myfile.txt} should become {@code numbered-myfile.txt}</li>
     *     <li>{@code pluto.dat} should become {@code numbered-pluto.dat}</li>
     * </ul>
     *
     * @param file the file on which the function should operate
     * @throws IOException if something very bad happens to the file system while operating
     */
    public static void addLineNumbersToTextFile(final File file) throws IOException {
        final var lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);        //Legge tutte le linee di testo dal file specificato (file.toPath()) utilizzando l'encoding UTF-8. Restituisce un elenco (List<String>) di linee di testo.
        final var numberedLines = new ArrayList<String>(lines.size());                      //Crea un nuovo oggetto ArrayList<String> denominato numberedLines, con una capacità iniziale uguale al numero di linee nel file letto.
        for (int lineNumber = 1; lineNumber <= lines.size(); lineNumber++) {                //Itera attraverso tutte le linee lette dal file.
            numberedLines.add(lineNumber + " " + lines.get(lineNumber - 1));                //Per ogni linea letta, aggiunge una nuova stringa all'ArrayList numberedLines. Questa nuova stringa contiene il numero di riga seguito da uno spazio e poi il contenuto effettivo della linea.
        }
        final var destination = new File(                                                   //Crea un nuovo oggetto File denominato destination che rappresenta il percorso in cui verrà scritto il nuovo file. Il nuovo file avrà lo stesso percorso del file originale, ma con il prefisso "numbered-" aggiunto al nome del file.
            file.getParentFile().getAbsolutePath() + File.separator + "numbered-" + file.getName()
        );
        Files.write(destination.toPath(), numberedLines, StandardCharsets.UTF_8);           //Scrive tutte le righe presenti nell'ArrayList numberedLines nel nuovo file specificato da destination, utilizzando l'encoding UTF-8.
    }
}
