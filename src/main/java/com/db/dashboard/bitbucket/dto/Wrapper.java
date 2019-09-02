package com.db.dashboard.bitbucket.dto;

import java.io.Serializable;

/**
 * @author Liubov Ruzanova
 */
public interface Wrapper<F,T> extends Serializable {

    T fromEntity(F entity);

    F toEntity();
}