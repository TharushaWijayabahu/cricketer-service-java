package service;

import data.Cricketer;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CricketerServiceImpl implements CricketerService {
    @Override
    public List<Cricketer> findCricketerByCricketer(List<Cricketer> cricketers, Cricketer cricketer) {
        if (cricketers == null || cricketers.size() < 1) {
            throw new RuntimeException("Empty list");
        }
//        Cricketer result = null;
//        for (Cricketer player : cricketers) {
//            // name -> duleesha
//            if (player.equals(cricketer)) {
//                result = player;
//                break;
//            }
//        }
        return cricketers.stream().filter(cricket -> cricket.equals(cricketer)).collect(Collectors.toList());
    }

    @Override
    public Cricketer findCricketerByCricketer(List<Cricketer> cricketers, String name) {
        if (cricketers == null || cricketers.size() < 1) {
            throw new RuntimeException("Empty list");
        }
        Cricketer cricketer = null;

        for (Cricketer player : cricketers) {
            // name -> duleesha
            if (player.getName().equals(name)) {
                cricketer = player;
                break;
            }
        }
        if (cricketer == null) {
            throw new RuntimeException("Searched player not found");
        }
        return cricketer;
    }
}
