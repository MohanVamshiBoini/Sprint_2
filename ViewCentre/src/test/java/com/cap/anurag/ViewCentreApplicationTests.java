package com.cap.anurag;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cap.anurag.entities.DiagnosticCentre;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@SpringBootTest
class ViewCentreApplicationTests {

	@Test
	public void testGetDiagnosticCentreListSuccess() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + 7873 + "/DiagnosticCentre/find";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<DiagnosticCentre[]> result = restTemplate.getForEntity(uri, DiagnosticCentre[].class);
	    DiagnosticCentre[] diagnosticCentre = result.getBody();
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertNotNull(diagnosticCentre);
	}
	@Test
	public void testGetDiagnosticCentreListUnsuccess() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + 7873 + "/DiagnosticCentre/find";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<DiagnosticCentre[]> result = restTemplate.getForEntity(uri, DiagnosticCentre[].class);
	    Assert.assertEquals(400, result.getStatusCodeValue());
	}
}
