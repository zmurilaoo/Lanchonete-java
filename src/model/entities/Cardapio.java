package model.entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Cardapio {
    private File cardapio;


    public void exibirCardapio(String file) {
        try {
            FileReader transFile = new FileReader(file);

            BufferedReader bf = new BufferedReader(transFile);

            String line = bf.readLine();

            while (line != null) {
                System.out.println(line);
                line =  bf.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public File getCardapio() {
        return cardapio;
    }
}
