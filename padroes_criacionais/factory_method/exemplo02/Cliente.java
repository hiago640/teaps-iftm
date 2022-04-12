package factory_method.exemplo02;

import factory_method.exemplo02.factory.LanchoneteCGFactory;
import factory_method.exemplo02.factory.LanchoneteJPFactory;
import factory_method.exemplo02.factory.SanduicheFactory;
import factory_method.exemplo02.product.Sanduiche;
import factory_method.exemplo02.product.enums.SanduicheEnum;

public class Cliente {

    public static void main(String[] args) {

        SanduicheFactory factory;
        factory = new LanchoneteCGFactory();

        Sanduiche sanduba1 = factory.createSanduiche(SanduicheEnum.BASICO);
        Sanduiche sandubaInfarto1 = factory.createSanduiche(SanduicheEnum.INFARTO);

        factory = new LanchoneteJPFactory();
        Sanduiche sanduba2 = factory.createSanduiche(SanduicheEnum.BASICO);
        Sanduiche sandubaInfarto2 = factory.createSanduiche(SanduicheEnum.INFARTO);

        System.out.println(sanduba1.toString());
        System.out.println(sanduba2.toString());
        System.out.println(sandubaInfarto1.toString());
        System.out.println(sandubaInfarto2.toString());
    }

}
