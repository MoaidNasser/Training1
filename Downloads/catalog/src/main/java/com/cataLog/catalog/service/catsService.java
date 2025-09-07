package com.cataLog.catalog.service;

import org.springframework.stereotype.Service;
import com.cataLog.catalog.repository.catsRepository;


@Service
public class catsService {
    private final catsRepository catsrepository;

    public catsService(catsRepository catsrepository) {
        this.catsrepository = catsrepository;
    }


}
