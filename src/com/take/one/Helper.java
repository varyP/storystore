package com.take.one;

import java.util.List;
import java.util.Random;

public class Helper {
	Random rand;
	
	public String randomChoice(List<String> list) {
		if (list != null && list.size() > 0) {
			rand = new Random();
			int randomNum = rand.nextInt(list.size());
			return list.get(randomNum);
		} else
			return null;
	}

}
