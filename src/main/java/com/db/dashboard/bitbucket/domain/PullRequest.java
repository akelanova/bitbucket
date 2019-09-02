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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String author;
    @Column
    private String branchName;
    @Column
    private String buildStatus;
}
