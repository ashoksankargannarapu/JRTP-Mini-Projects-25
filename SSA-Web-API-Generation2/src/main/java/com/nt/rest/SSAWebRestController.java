package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.Response;

@RestController
public class SSAWebRestController {

    @GetMapping("/ssn/{ssn}")
    public Response getStateBySSN(@PathVariable String ssn) {
        Response response = new Response();
        
        if (ssn.startsWith("1")) {
            response.setStateName("New Jersey");
        } else if (ssn.startsWith("2")) {
            response.setStateName("Texas");
        } else if (ssn.startsWith("3")) {
            response.setStateName("Dallas");
        } else if (ssn.startsWith("4")) {
            response.setStateName("Rhode Island");
        } else if (ssn.startsWith("5")) {
            response.setStateName("Ohio");
        } else if (ssn.startsWith("6")) {
            response.setStateName("Alabama");
        } else if (ssn.startsWith("7")) {
            response.setStateName("Kentucky");
        } else if (ssn.startsWith("8")) {
            response.setStateName("California");
        } else if (ssn.startsWith("9")) {
            response.setStateName("Standford");
        }
        // Add more conditions as needed
        
        // If none of the conditions match, you can handle it accordingly
        else {
            response.setStateName("Unknown");
        }
        
        response.setSsn(ssn);
        return response;
    }
}
