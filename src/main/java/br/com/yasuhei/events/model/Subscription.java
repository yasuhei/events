package br.com.yasuhei.events.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "tbl_subscription")

public class Subscription {
    @Id
    private SubscriptId id;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="level")
    private Integer level;

    @Column(name="unique_id", nullable = false, length = 45)
    private String uniqueID;

}
