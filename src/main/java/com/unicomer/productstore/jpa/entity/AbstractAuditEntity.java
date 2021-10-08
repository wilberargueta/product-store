package com.unicomer.productstore.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractAuditEntity {

    @Column(name = "CREATE_AT")
    private LocalDateTime createAt;

    @Column(name = "UPDATE_AT")
    private LocalDateTime updateAt;

    @Column(name = "DELETE_AT")
    private LocalDateTime deleteAt;

    @Column(name = "ENABLE")
    private Character enable;


}
