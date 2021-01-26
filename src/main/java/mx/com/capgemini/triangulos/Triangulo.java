package mx.com.capgemini.triangulos;

import java.util.stream.Stream;
import org.apache.log4j.Logger;

public class Triangulo {

    final static Logger logger = Logger.getLogger(Triangulo.class);

    public void printTriangulo(int num) {
        for (int altura = 1; altura <= num; altura++) {
            StringBuilder sb = new StringBuilder();
            Stream.iterate(1, n -> n + 1)
                    .limit(num - altura)
                    .forEach(x -> sb.append(" "));

            Stream.iterate(1, n -> n + 1)
                    .limit(altura * 2 - 1)
                    .forEach(x -> sb.append("*"));
            logger.info(sb.toString());
        }

    }
}
