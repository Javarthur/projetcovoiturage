package com.zicaro.covoiturage.repositories;

import com.zicaro.covoiturage.model.Hello;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arthur on 18/02/2017.
 */
public interface HelloRepository extends CrudRepository<Hello,Long> {
}
