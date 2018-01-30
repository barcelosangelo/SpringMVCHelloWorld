package org.academiadecodigo.bootcamp.Service;

import org.academiadecodigo.bootcamp.Model.BootCamp;

import java.util.ArrayList;
import java.util.Map;

public class MockBootcampService implements BootcampService{

    private Map<Integer,BootCamp> bootCamps;

    @Override
    public ArrayList<BootCamp> findAllBootcamps() {
        return new ArrayList<>(bootCamps.values());
    }
}
