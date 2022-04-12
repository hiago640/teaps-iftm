package factory_method.exemplo02.product;

import factory_method.exemplo02.product.enums.QueijoEnum;
import factory_method.exemplo02.product.enums.PaoEnum;
import factory_method.exemplo02.product.enums.PresuntoEnum;
import factory_method.exemplo02.product.enums.SaladaEnum;

public class SanduicheBasico extends Sanduiche {

    public SanduicheBasico(PaoEnum tipoPao, QueijoEnum tipoQueijo, PresuntoEnum tipoPresunto, SaladaEnum tipoSalada) {
        this.tipoPao = tipoPao;
        this.tipoQueijo = tipoQueijo;
        this.tipoPresunto = tipoPresunto;
        this.tipoSalada = tipoSalada;
    }

    @Override
    public String toString() {
        return String.format(
                "SanduicheBasico [descricao=%s, tipoPao=%s, tipoQueijo=%s, tipoPresunto=%s, tipoSalada=%s]", descricao,
                tipoPao, tipoQueijo, tipoPresunto, tipoSalada);
    }

}
