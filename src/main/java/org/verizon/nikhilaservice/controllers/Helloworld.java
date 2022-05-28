package org.verizon.nikhilaservice.controllers;

import org.springframework.web.bind.annotation.*;
import org.verizon.nikhilaservice.beans.Request;
import org.verizon.nikhilaservice.beans.Response;

@RestController
public class Helloworld {

    // learning purpose
    @GetMapping("/{name}")
    public String sayHelloWorld(@PathVariable("name") String name) {
        return "Helloworld " + name;
    }

    // learning purpose
    @GetMapping("/helloworld")
    public String sayHelloWorld2(@RequestParam(required = false) String name) {
        return "Helloworld " + name;
    }

    // this is the work way
    @PostMapping("/helloworldrequest")
    public String sayHelloWorld2(@RequestBody Request request) {
        Response response = new Response();
        response.setFirstName(request.getFirstName());
        response.setLastName(request.getLastName());
        return response.toString();
    }

}
