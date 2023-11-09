package com.ra.userservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Data
@NoArgsConstructor
@Table("users")
public class User {

    @PrimaryKey
    private UUID id;
    private String username;
    private String password;
    
}
