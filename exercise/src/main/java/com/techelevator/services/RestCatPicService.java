package com.techelevator.services;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatPic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class RestCatPicService implements CatPicService {

	@Override
	@RequestMapping(path = "https://cat-data.netlify.app/api/pictures/random", method = RequestMethod.GET)
	public CatPic getPic() {
		// TODO Auto-generated method stub
		CatPic catPic = new CatPic();

		catPic.setFile();
		return getPic();
	}

}	
