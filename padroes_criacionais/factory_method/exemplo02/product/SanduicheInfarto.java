package factory_method.exemplo02.product;

import factory_method.exemplo02.product.enums.PaoEnum;
import factory_method.exemplo02.product.enums.PresuntoEnum;
import factory_method.exemplo02.product.enums.QueijoEnum;
import factory_method.exemplo02.product.enums.SaladaEnum;

public class SanduicheInfarto extends Sanduiche {

    public SanduicheInfarto(PaoEnum tipoPao, QueijoEnum tipoQueijo, QueijoEnum tipoQueijo2, QueijoEnum tipoQueijo3,
            PresuntoEnum presunto1, PresuntoEnum presunto2, SaladaEnum tipoSalada) {
        this.tipoPao = tipoPao;
        this.tipoQueijo = tipoQueijo;
        this.tipoQueijo2 = tipoQueijo2;
        this.tipoQueijo3 = tipoQueijo3;
        this.tipoPresunto = presunto1;
        this.tipoPresunto2 = presunto2;
        this.tipoSalada = SaladaEnum.COM_VERDURA;
    }

    @Override
    public String toString() {
        return String.format(
                "SanduicheInfarto [descricao=%s, tipoPao=%s, tipoQueijo=%s, tipoQueijo2=%s, tipoQueijo3=%s, tipoPresunto=%s, tipoPresunto2=%s, tipoSalada=%s]",
                descricao, tipoPao, tipoQueijo, tipoQueijo2, tipoQueijo3, tipoPresunto, tipoPresunto2, tipoSalada);
    }

}
