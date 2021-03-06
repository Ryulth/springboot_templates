package com.template.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Data
public class City2 implements Serializable {
    public static final String tableName = "test";
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String state;

    @Column(name = "code",nullable = false)
    private String code;

    @Column(name = "createTime", nullable = false, updatable = false)
    private Calendar createTime;

    @Column(name = "updateTime")
    private Calendar updateTime;

    @Builder
    public City2(String name, String state) {
        this.name = name;
        this.state = state;
    }

    @PrePersist
        // 새로운 것이 추가되었다. !!!
    void preInsert() {
        this.createTime = Calendar.getInstance();
    }

    protected City2() {
    } // 비어있는 생성자 요구
}
