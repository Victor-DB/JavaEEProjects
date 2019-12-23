package com.repository;

import com.bychkov.entity.Words;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryInterface extends JpaRepository<Words, Integer> {

}
