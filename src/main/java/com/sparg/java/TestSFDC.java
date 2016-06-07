package com.sparg.java;

import com.force.api.ApiConfig;
import com.force.api.ForceApi;
import com.sparg.java.model.sfdc.Account;

/**
 * @author: vimal.sengoden
 * Date: 10/22/2015
 * Time: 11:20 AM
 */
public class TestSFDC {

    public static void main(String[] args) {
        final ApiConfig apiConfig = new ApiConfig();
        apiConfig.setLoginEndpoint("https://test.salesforce.com");
        apiConfig.setUsername("***");
        apiConfig.setPassword("***");
        apiConfig.setClientId("3MVG9GiqKapCZBwGJnc35Vt2VpawyygrhDKdYCSUpqlr0.pfSXM7w3lgvAA1S6jDBt9VW1fit_a_.6tq3J_Ou");
        apiConfig.setClientSecret("4872660811045908369");
        final ForceApi forceApi = new ForceApi(apiConfig);

        Account a = forceApi.getSObject("Account", "001Z000000xiWfeIAE").as(Account.class);
        System.out.println(a);
    }



}
