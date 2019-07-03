package com.codegym.persistence;

import com.codegym.model.User;

public interface GeneralPersistence<E> {
    User checkLogin(E e);
}
