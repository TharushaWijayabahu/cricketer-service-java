import data.Cricketer;
import service.CricketerService;
import service.CricketerServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        /**
         * Cricketer has jerseyId, name, country, age
         */
        List<Cricketer> cricketerList = new ArrayList<>();

        cricketerList.add(new Cricketer("duleesha", 1, 28, "SL"));
        cricketerList.add(new Cricketer("Nuwanthi", 2, 28, "SL"));
        cricketerList.add(new Cricketer("Wellala", 3, 28, "SL"));
        cricketerList.add(new Cricketer("Wijewantha", 4, 28, "SL"));
        cricketerList.add(new Cricketer("Wijayabahu", 5, 28, "SL"));

        CricketerService cricketerService  = new CricketerServiceImpl();

        System.out.println(cricketerService.findCricketerByCricketer(cricketerList,"duleesha"));

        Date date = new Date();
        Integer name = null;
        System.out.println(Boolean.valueOf(null)); // -> "1"

    }

}
