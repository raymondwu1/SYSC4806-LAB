package com;

import com.BuddyInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long>{

    List<BuddyInfo> findByName(String name);
}
