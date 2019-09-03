package com.db.dashboard.bitbucket.domain.dao;

import com.db.dashboard.bitbucket.domain.PullRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Liubov Ruzanova
 */
@Repository
public interface PullRequestDao extends CrudRepository<PullRequest, Long> {

}
