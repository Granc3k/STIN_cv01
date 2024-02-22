package cz.martin.simon.tul.stin;

import cz.martin.simon.tul.stin.Model.Data;
import cz.martin.simon.tul.stin.Module.Module;
import cz.martin.simon.tul.stin.Processors.ProcessOne;
import cz.martin.simon.tul.stin.Processors.ProcessTwo;
import cz.martin.simon.tul.stin.Transformers.TransformerOne;
import cz.martin.simon.tul.stin.Transformers.TransformerTwo;

public class Main {
    public static void main(String[] args) {
        Module modul = new Module();

        Data data = new Data("kokos",420,69);

        TransformerOne t1 = new TransformerOne();
        TransformerTwo t2 = new TransformerTwo();
        ProcessOne p1 = new ProcessOne();
        ProcessTwo p2 = new ProcessTwo();

        modul.setTransformer(t1);
        modul.addProcess(p1);
        modul.addProcess(p2);


        modul.process(data);
    }
}