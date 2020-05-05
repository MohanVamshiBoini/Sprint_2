package com.cap.anurag;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@SpringBootTest
class DeleteCentreApplicationTests {

	@Test
	public void testDeleteDiagnosticCentreListSuccess() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:7872/DiagnosticCentre/delete/446";
		URI uri = new URI(baseUrl);
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	public void testDeleteDiagnosticCentreListUnsuccess() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:7872/DiagnosticCentre/delete/776";
		URI uri = new URI(baseUrl);
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
		Assert.assertEquals(500, result.getStatusCodeValue());
	}

}
