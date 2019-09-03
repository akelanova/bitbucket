package com.db.dashboard.bitbucket.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Liubov Ruzanova
 */
@Getter
@Setter
@NoArgsConstructor
public class PullRequestList {
    private List<PullRequest> pullRequests;
    public PullRequestList(List<PullRequest> list){
        pullRequests = list;
    }
}
