package com.tao.poc.gcp.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.tao.poc.gcp.rest.web.dto.CardAccount;
import com.tao.poc.gcp.rest.web.dto.CheckBookRequest;
import com.tao.poc.gcp.rest.web.dto.CheckBookResponse;

@Controller
public class BankRequestController {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private Environment	env;
	
	@PostMapping(value = "/createrequest", produces = "application/json",
			consumes = "application/json")
	@ResponseBody
	public CheckBookResponse submitCheckBookRequest(@RequestBody(required = true)
														CheckBookRequest request) {
		String accurl = env.getProperty("spring.webservices.accountvalidation");
		String checkurl = env.getProperty("spring.webservices.checkbookrequest");
		CheckBookResponse status = new CheckBookResponse();
		
		CardAccount resultString;
		HttpHeaders headers;

		try {
			HttpEntity<CardAccount> response = template.exchange(accurl + "/" + request.getAccountNumber(),
					HttpMethod.GET,
					null, CardAccount.class, "");
			resultString = response.getBody();
			headers = response.getHeaders();
		}
		catch (RestClientException re) {
			status.setStatus("Wrong Account Number");
			return status;
		}

		try {
			HttpEntity<String> resp = template.postForEntity(checkurl,request,
					String.class, "" );
			status.setStatus("Done");
		}
		catch (RestClientException re) {
			status.setStatus("Could not create request");
		}

		return status;
	}
}