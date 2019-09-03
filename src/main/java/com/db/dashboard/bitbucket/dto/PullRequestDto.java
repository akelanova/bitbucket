package com.db.dashboard.bitbucket.dto;

import com.db.dashboard.bitbucket.domain.PullRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Liubov Ruzanova
 */
@Getter
@Setter
@NoArgsConstructor
public class PullRequestDto implements Wrapper<PullRequest, PullRequestDto> {

    private long id;
    private String author;
    private SourceDto source;
//    private String buildStatus;

    public static PullRequestDto createStub(){
        PullRequestDto pullRequestDto = new PullRequestDto();
        pullRequestDto.id = 5;
        pullRequestDto.author = "Zheka";
        pullRequestDto.source = new SourceDto("braaanch");
//        pullRequestDto.buildStatus = "success";
        return pullRequestDto;
    }

    public PullRequestDto(PullRequest pullRequest){
        this.id = pullRequest.getId();
        this.author = pullRequest.getAuthor();
        this.source = new SourceDto(pullRequest.getBranchName());
//        this.buildStatus = pullRequest.getBuildStatus();
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
        request.setBranchName(source.getBranch().getName());
//        request.setBuildStatus(this.buildStatus);
        return request;
    }
}
