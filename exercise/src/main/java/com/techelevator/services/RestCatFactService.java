package com.techelevator.services;

import com.techelevator.model.CatPic;
import org.springframework.stereotype.Component;

import com.techelevator.model.CatFact;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatFactService implements CatFactService {
	private final RestTemplate restTemplate = new RestTemplate();

	@Override
	public CatFact getFact() {
		// TODO Auto-generated method stub
		String url = "https://cat-data.netlify.app/api/facts/random";
		CatFact catFact = restTemplate.getForObject(url, CatFact.class);
		return catFact;
	}

}
