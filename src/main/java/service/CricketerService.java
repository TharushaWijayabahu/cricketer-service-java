package service;

import data.Cricketer;

import java.util.List;

public interface CricketerService {

    List<Cricketer> findCricketerByCricketer(List<Cricketer> cricketers, Cricketer cricketer);

    Cricketer findCricketerByCricketer(List<Cricketer> cricketers, String name);
}
