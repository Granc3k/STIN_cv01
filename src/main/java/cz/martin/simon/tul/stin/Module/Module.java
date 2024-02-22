package cz.martin.simon.tul.stin.Module;

import cz.martin.simon.tul.stin.Model.Data;
import cz.martin.simon.tul.stin.Processors.IProcessor;
import cz.martin.simon.tul.stin.Transformers.ITransformer;

import java.util.ArrayList;

public class Module {
    private ITransformer transformer;

    private final ArrayList<IProcessor> processes = new ArrayList<>();

    public void setTransformer(ITransformer transformer){
        this.transformer=transformer;
    }

    public void addProcess(IProcessor process){
        this.processes.add(process);
    }

    public void process(Data data){
        transformer.transform(data);
        for(IProcessor p : processes){
            p.process(data);
        }
    }
}
