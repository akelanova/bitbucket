package com.db.dashboard.client;

import com.db.dashboard.bitbucket.domain.PullRequestList;
import com.db.dashboard.bitbucket.domain.PullRequest;
import com.db.dashboard.bitbucket.domain.dao.PullRequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author Liubov Ruzanova
 */
@RestController
public class ClientController {

    @Autowired
    private PullRequestDao pullRequestDao;


    @GetMapping("/dashboard")
    public @ResponseBody
    PullRequestList getDashboard() {
        Iterable<PullRequest> all = pullRequestDao.findAll();
        ArrayList<PullRequest> pullRequests = new ArrayList<>();
        all.forEach(pullRequests::add);
        return new PullRequestList(pullRequests);
    }

}
