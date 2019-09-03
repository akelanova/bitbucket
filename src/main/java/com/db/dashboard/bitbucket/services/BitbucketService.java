package com.db.dashboard.bitbucket.services;

import com.db.dashboard.bitbucket.domain.dao.PullRequestDao;
import com.db.dashboard.bitbucket.dto.PullRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liubov Ruzanova
 */
@Service
public class BitbucketService {

    @Autowired
    private PullRequestDao pullRequestDao;

    public void proceed(PullRequestDto pullRequestDto) {
        pullRequestDao.save(pullRequestDto.toEntity());

    }
}
