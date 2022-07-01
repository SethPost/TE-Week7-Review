package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardNotFoundException;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CatController {

    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }

    @RequestMapping(path = "/api/cards", method = RequestMethod.GET)
    public List<CatCard> list() {
        return catCardDao.list();
    }

    @RequestMapping(path = "/api/cards/{id}", method = RequestMethod.GET)
    public CatCard get(@PathVariable int id) {
        return catCardDao.get(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/api/cards", method = RequestMethod.POST)
    public boolean create(@RequestBody CatCard catCard) throws CatCardNotFoundException {
        return catCardDao.save(catCard);
    }

    
}
