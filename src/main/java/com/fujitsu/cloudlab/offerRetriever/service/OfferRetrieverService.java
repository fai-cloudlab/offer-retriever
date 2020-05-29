package com.fujitsu.cloudlab.offerRetriever.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fujitsu.cloudlab.commons.constants.AppConstants;
import com.fujitsu.cloudlab.commons.exception.ApiException;
import com.fujitsu.cloudlab.offer.json.model.Offer;
import com.fujitsu.cloudlab.offer.json.model.OffersList;
import com.fujitsu.cloudlab.offerRetriever.repository.OfferDataRepository;


@Service
public class OfferRetrieverService {
	@Autowired private OfferDataRepository offerDataRepository;
	
	public OffersList getOfferDetails(String offerId) throws ApiException {
		Offer offer = offerDataRepository.retrieveOffer(offerId);
		if(offer == null)
			throw new ApiException(AppConstants.OFR404, "Offer not found", "Offer not found in DB", null);
		
		OffersList offersList = new OffersList();
		List<Offer> offers = new ArrayList<>();
		offers.add(offer);
		offersList.setOffers(offers);
		return offersList;
	}

}
