package com.db.dashboard.bitbucket.util;

import com.db.dashboard.bitbucket.dto.PullRequestDto;

/**
 * @author Liubov Ruzanova
 */
public class JsonParserUtil {

    public static PullRequestDto getPullRequestDto(Object json) {
        //Got big JSON and aggregate from this only useful info and return new json


        return PullRequestDto.createStub();//todo: CHANGEEE
    }
}
