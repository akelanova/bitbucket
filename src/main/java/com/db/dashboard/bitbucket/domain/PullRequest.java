package com.db.dashboard.bitbucket.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Liubov Ruzanova
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PullRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String author;
    private String branchName;
    private String buildStatus;
}
