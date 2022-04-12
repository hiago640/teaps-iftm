package factory_method.exemplo02.product;

import factory_method.exemplo02.product.enums.PaoEnum;
import factory_method.exemplo02.product.enums.PresuntoEnum;
import factory_method.exemplo02.product.enums.QueijoEnum;
import factory_method.exemplo02.product.enums.SaladaEnum;

public abstract class Sanduiche {
    public String descricao;
    public PaoEnum tipoPao;
    public QueijoEnum tipoQueijo;
    public QueijoEnum tipoQueijo2;
    public QueijoEnum tipoQueijo3;
    public PresuntoEnum tipoPresunto;
    public PresuntoEnum tipoPresunto2;
    public SaladaEnum tipoSalada;

    public void fritar() {
        System.out.println("Tá pegando fogo bixo!");
    }

    @Override
    public String toString() {
        return String.format(
                "Sanduiche [descricao=%s, tipoPao=%s, tipoQueijo=%s, tipoQueijo2=%s, tipoQueijo3=%s, tipoPresunto=%s, tipoPresunto2=%s, tipoSalada=%s]",
                descricao, tipoPao, tipoQueijo, tipoQueijo2, tipoQueijo3, tipoPresunto, tipoPresunto2, tipoSalada);
    }

}
