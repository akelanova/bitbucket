package com.db.dashboard.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liubov Ruzanova
 */
@RestController
public class ClientController {
    private Object someJson;

    @PostMapping("/dashboard")
    public Object getInfo(@RequestBody Object json) {
        // trigger for update ?

        someJson = json;
        System.out.println(json);
        return someJson;
    }

    @GetMapping("/dashboard")
    public Object getDashboard() {
        //get from DB


        return someJson;
    }

}
