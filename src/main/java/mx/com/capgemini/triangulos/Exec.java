package mx.com.capgemini.triangulos;

import org.apache.log4j.Logger;

public class Exec {

    final static Logger logger = Logger.getLogger(Exec.class);

    public static void main(String[] args) {
        logger.info(" --------------Triangulo---------------");
        Triangulo triangulo = new Triangulo();
        triangulo.printTriangulo(15);

        logger.info("-----------Triangulo Invertido-----------");
        TrianguloI trianguloInvertido = new TrianguloI();
        trianguloInvertido.printTriangulo(15);
    }
}
