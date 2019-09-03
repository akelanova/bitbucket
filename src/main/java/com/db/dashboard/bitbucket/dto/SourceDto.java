package com.db.dashboard.bitbucket.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * @author Liubov Ruzanova
 */
@Setter
@Getter
@NoArgsConstructor
public class SourceDto {
    private BranchDto branch;
    public SourceDto(String name){
        this.branch = new BranchDto(name);
    }
}
