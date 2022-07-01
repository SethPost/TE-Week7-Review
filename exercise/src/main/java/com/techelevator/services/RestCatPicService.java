package com.techelevator.services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.techelevator.model.CatPic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatPicService implements CatPicService {
	private final RestTemplate restTemplate = new RestTemplate();

	@Override

	public CatPic getPic() {
		// TODO Auto-generated method stub
		String url = "https://cat-data.netlify.app/api/pictures/random";
		CatPic catPic = restTemplate.getForObject(url, CatPic.class);
		return catPic;
	}

}	
