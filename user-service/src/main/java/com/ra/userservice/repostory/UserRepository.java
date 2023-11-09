package com.ra.userservice.repository;

import com.ra.userservice.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CassandraRepository<User, UUID> {
    // You can define custom queries using Cassandra query methods or annotations
    User findByUsername(String username);
}
