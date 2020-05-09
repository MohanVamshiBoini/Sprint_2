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
		final String baseUrl = "http://localhost:7872/DiagnosticCentre/delete/925";// Enter present id
		URI uri = new URI(baseUrl);
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

}
