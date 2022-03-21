package com.exercise_1.simple_job_app_system_ws.io.repository;

import com.exercise_1.simple_job_app_system_ws.io.entity.JobApplicationEntity;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepository extends PagingAndSortingRepository<JobApplicationEntity, Long> {
    JobApplicationEntity findByApplicationId(String id);

}
