package com.cardif.arquetipojunit.siisimpleservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SiiService {
    List<String> GetRutsArraigo();
}
