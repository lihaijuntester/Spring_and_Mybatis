package com.mapper;

import com.entity.Suser;
import org.omg.PortableInterceptor.SUCCESSFUL;

import java.util.List;

/**
 * Created by arvin on 2018/3/28.
 */
public interface UserMapper {

    void save(Suser suser);
    void update(Suser suser);
    void delete(int id);
    Suser findById(int id);
    List<Suser> findAll(int id);
}
