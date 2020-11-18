package Demo.APIRestful;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoDMPRTProcessOfferResult {
	
	@Test
	
 public void test() {

   //   public static void main(String[] args) {
  try {
         // String hostName="mccm-191102761.eu-central-1.elb.amazonaws.com";
	  
	//  https://192.57.138.25:18576/prweb/PRRestService/CSM/customerMarketingProductAPI/processOffersResult
         String hostName = "192.57.138.25";
         String port = "18576";// 8573

         URL urlForGetRequest = new URL("https://" + hostName + ":" + port
                      + "/prweb/PRRestService/CSM/customerMarketingProductAPI/processOffersResult");
         String readLine = null;
         System.setProperty("javax.net.ssl.keyStore","C:/Users/prout21/MCCM/keystore/css1identity.jks");
         System.setProperty("javax.net.ssl.keyStorePassword", "password");
         System.setProperty("javax.net.ssl.keyStoreType", "JKS");
         System.setProperty("javax.net.ssl.trustStore", "C:/Users/prout21/MCCM/keystore/mccminternaltrust.jks");
         System.setProperty("javax.net.ssl.trustStorePassword", "password");
         System.setProperty("javax.net.ssl.trustStoreType", "JKS");

      //  String json = "[{ \"parts\" : {\"campaign\":{\"container\":\"CSM\"},\"subscription\":{\"id\":[{\"value\":\"7cd536xz3000\",\"schemeID\":\"Pega\"}]}}}]";
        
   //   String json =  "[{ \"parts\" : {\"campaign\":{\"container\":\"CSM\",\"id\":[{\"value\":\"P-287\"}]},\"subscription\":{\"id\":[{\"value\":\"8cd536xz3001\",\"schemeID\":\"MobileHashed\"}]}}}]";
 //     String json = "[{\"roles\": {\"subscriber\": {\"id\": [{\"schemeID\": \"Pega\",\"value\": \"45189091\"}]}}, \"name\": \"UpsellOffer1GB\"}]";
//  String json =  "[{ \"parts\" : {\"campaign\":{\"container\":\"CSM\"},\"name\": \"UpsellOffer1GB\",\"subscription\":{\"id\":[{\"value\":\"8cd536xz3001\",\"schemeID\":\"MobileHashed\"}]}}}]";
         
  String json = "[{\"roles\":{\"subscriber\":{\"id\":[{\"schemeID\":\"Pega\",\"value\":\"45189091\"}]}},\"parts\":{\"campaign\":{\"container\":\"CSM\",\"id\":[{\"value\":\"P-287\"}]},\"subscription\":{\"id\":[{\"value\":\"8cd536xz3001\",\"schemeID\":\"MobileHashed\"}]}}}]";
  
  
  
  
  
  
         // Create all-trusting host name verifier
         HostnameVerifier allHostsValid = new HostnameVerifier() {
               public boolean verify(String hostname, SSLSession session) {
                      return true;
               }
         };

         // Install the all-trusting host verifier
         HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
         HttpsURLConnection connection = (HttpsURLConnection) urlForGetRequest.openConnection();
         connection.setRequestMethod("POST");
         connection.setRequestProperty("Content-Type", "application/json");
         StringBuffer response = new StringBuffer();
         connection.setDoOutput(true);
         connection.setDoInput(true);
         OutputStream os = connection.getOutputStream();
         os.write(json.getBytes());
         os.flush();
         os.close();
         int responseCode = connection.getResponseCode();

         BufferedReader in = null;
         if (responseCode == 200)
               in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
         else
               in = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
         while ((readLine = in.readLine()) != null) {
               response.append(readLine);
         }
         in.close();
         System.out.println("response: " + response.toString());
         
         Assert.assertEquals(responseCode, 200, "Status code is not 200,");
                     
              } catch (Exception e) {
                     e.printStackTrace();
                     
                     
              }
       
     		
       }

}

