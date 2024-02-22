package cz.martin.simon.tul.stin.Transformers;

import cz.martin.simon.tul.stin.Model.Data;

public class TransformerTwo implements ITransformer{
    @Override
    public void transform(Data data) {
        data.setF((data.getF()/2));
    }
}
