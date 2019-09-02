package com.db.dashboard.bitbucket.services;

import com.db.dashboard.bitbucket.domain.dao.PullRequestDao;
import com.db.dashboard.bitbucket.dto.PullRequestDto;
import com.db.dashboard.bitbucket.util.JsonParserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liubov Ruzanova
 */
@Service
public class BitbucketService {

    @Autowired
    private PullRequestDao pullRequestDao;

    public void proceed(Object json) {
        PullRequestDto pullRequestDto = JsonParserUtil.getPullRequestDto(json);
        pullRequestDao.save(pullRequestDto.toEntity());

    }
}
