package com.cardif.arquetipojunit.siisimpleservice;


import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class SiiServiceImpl implements SiiService {
    private List<String> RutsArraigo = Arrays.asList("18000000-0", "19000000-0");

    public List<String> GetRutsArraigo(){
        //Simulate an HTTP call.
        return RutsArraigo;
    }
}
