package com.db.dashboard.bitbucket.controllers;

import com.db.dashboard.bitbucket.services.BitbucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liubov Ruzanova
 */
@RestController
public class BitbucketController {
    @Autowired
    private BitbucketService bitbucketService;

    @PostMapping("/bitbucketWebhook")
    public void infoFromWebhook(@RequestBody Object json) {
        bitbucketService.proceed(json);
    }
}
