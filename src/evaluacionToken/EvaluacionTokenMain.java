package evaluacionToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EvaluacionTokenMain {

    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("Medellin", "La 30", "Enero", 1000);
        Ciudad c2 = new Ciudad("Medellin", "La 30", "Febrero", 800);
        Ciudad c3 = new Ciudad("Medellin", "Los aples", "Enero", 1200);
        Ciudad c4 = new Ciudad("Medellin", "Los aples", "Febrero", 1000);
        Ciudad c5 = new Ciudad("Medellin", "Los aples", "Marzo", 2000);
        Ciudad c6 = new Ciudad("Cali", "La 30", "Enero", 500);
        Ciudad c7 = new Ciudad("Cali", "La 30", "Febrero", 400);
        Ciudad c8 = new Ciudad("Cali", "Los aples", "Enero", 800);
        Ciudad c9 = new Ciudad("Cali", "Los aples", "Febrero", 700);
        Ciudad c10 = new Ciudad("Cali", "Los aples", "Marzo", 600);

        List<Ciudad> ciudadList = new ArrayList<>();


        ciudadList.add(c1);
        ciudadList.add(c2);
        ciudadList.add(c3);
        ciudadList.add(c4);
        ciudadList.add(c5);
        ciudadList.add(c6);
        ciudadList.add(c7);
        ciudadList.add(c8);
        ciudadList.add(c9);
        ciudadList.add(c10);

        Map<String, Map<String, Long>> map = ciudadList.stream().collect(
                Collectors.groupingBy(
                        Ciudad::getNombre, Collectors.groupingBy(
                                Ciudad::getMes, Collectors.summingLong(Ciudad::getVenta)
                        )
                )
        );


        System.out.println(map);
    }

}
