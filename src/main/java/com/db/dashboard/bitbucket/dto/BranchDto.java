package com.db.dashboard.bitbucket.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Liubov Ruzanova
 */
@Getter
@Setter
@NoArgsConstructor
public class BranchDto {
    private String name;

    public BranchDto(String name) {
        this.name = name;
    }
}
