package cz.martin.simon.tul.stin.Transformers;

import cz.martin.simon.tul.stin.Model.Data;

public class TransformerOne implements ITransformer{

    @Override
    public void transform(Data data) {
        data.setI((data.getI()/2));
    }
}
