package mx.com.capgemini.triangulos;

import java.util.stream.Stream;
import org.apache.log4j.Logger;

public class TrianguloI {

    final static Logger logger = Logger.getLogger(TrianguloI.class);

    public void printTriangulo(int num) {

        for (int numBlancos = 0, numAsteriscos = (num * 2) - 1; numAsteriscos > 0; numBlancos++, numAsteriscos -= 2) {
            StringBuilder sb = new StringBuilder();

            Stream.iterate(0, n -> n + 1)
                    .limit(numBlancos)
                    .forEach(x -> sb.append(" "));

            Stream.iterate(0, n -> n + 1)
                    .limit(numAsteriscos)
                    .forEach(x -> sb.append("*"));

            logger.info(sb.toString());
        }
    }

}
