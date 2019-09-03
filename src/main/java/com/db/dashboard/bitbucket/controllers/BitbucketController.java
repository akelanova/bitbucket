package com.db.dashboard.bitbucket.controllers;

import com.db.dashboard.bitbucket.dto.PullRequestDto;
import com.db.dashboard.bitbucket.services.BitbucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public void infoFromWebhook(@RequestBody PullRequestDto json) {
        bitbucketService.proceed(json);
    }
}
