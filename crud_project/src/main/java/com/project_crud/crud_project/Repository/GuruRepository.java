package com.project_crud.crud_project.Repository;

import org.springframework.data.repository.CrudRepository;
import com.project_crud.crud_project.Model.Guru;

public interface GuruRepository extends CrudRepository<Guru, Integer> {
    
}
