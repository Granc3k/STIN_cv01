package cz.martin.simon.tul.stin.Processors;

import cz.martin.simon.tul.stin.Model.Data;

public class ProcessTwo implements IProcessor{

    @Override
    public void process(Data data) {
        System.out.println((data.getI()+data.getF())+" , "+data.getS()+" = "+ data.getI()+" + "+data.getF());

    }
}
