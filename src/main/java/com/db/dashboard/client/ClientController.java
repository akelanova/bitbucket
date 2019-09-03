package com.db.dashboard.client;

import com.db.dashboard.bitbucket.domain.PullRequest;
import com.db.dashboard.bitbucket.domain.dao.PullRequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liubov Ruzanova
 */
@RestController
public class ClientController {

    @Autowired
    private PullRequestDao pullRequestDao;


    @GetMapping("/dashboard")
    public Object getDashboard() {
        Iterable<PullRequest> all = pullRequestDao.findAll();
        return all;
    }

}
