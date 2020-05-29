package com.fujitsu.cloudlab.offerRetriever.repository;

import com.fujitsu.cloudlab.offer.json.model.Offer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class OfferDataRepository {
	private ValueOperations<String,Offer> valueOperations;

	@Autowired
	OfferDataRepository(RedisTemplate<String, Offer> redisTemplate){
		  this.valueOperations = redisTemplate.opsForValue();
	  }

  public Offer retrieveOffer(String offerId) {
	  return valueOperations.get(offerId);
  }

}
