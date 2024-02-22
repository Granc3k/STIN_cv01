package cz.martin.simon.tul.stin.Processors;

import cz.martin.simon.tul.stin.Model.Data;

public class ProcessOne implements IProcessor{


    @Override
    public void process(Data data) {
        System.out.println("Int: "+data.getI()+" , String: "+data.getS());
    }
}
