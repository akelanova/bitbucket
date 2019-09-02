package com.db.dashboard.bitbucket.dto;

import com.db.dashboard.bitbucket.domain.PullRequest;
import com.db.dashboard.bitbucket.domain.dao.PullRequestDao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Liubov Ruzanova
 */
@Getter
@Setter
@NoArgsConstructor
public class PullRequestDto implements Wrapper<PullRequest, PullRequestDto> {

    private long id;
    private String author;
    private String branchName;
    private String buildStatus;

    public static PullRequestDto createStub(){
        PullRequestDto pullRequestDto = new PullRequestDto();
        pullRequestDto.id = 2;
        pullRequestDto.author = "Liubov";
        pullRequestDto.branchName = "feature/jira123";
        pullRequestDto.buildStatus = "success";
        return pullRequestDto;
    }


    public PullRequestDto(PullRequest pullRequest){
        this.id = pullRequest.getId();
        this.author = pullRequest.getAuthor();
        this.branchName = pullRequest.getBranchName();
        this.buildStatus = pullRequest.getBuildStatus();
    }


    @Override
    public PullRequestDto fromEntity(PullRequest entity) {
        return new PullRequestDto(entity);
    }

    @Override
    public PullRequest toEntity() {
        PullRequest request = new PullRequest();
        request.setId(this.id);
        request.setAuthor(this.author);
        request.setBranchName(this.branchName);
        request.setBuildStatus(this.buildStatus);
        return request;
    }
}
