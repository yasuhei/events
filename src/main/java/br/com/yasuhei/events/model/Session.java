package br.com.yasuhei.events.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tbl_session")
@Getter
@Setter
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_session")
    private Integer idSession;

    @Column(name = "title", length = 255, nullable = false)
    private String title;
    @Column(name="start_date", nullable = false)
    private LocalDate startDate;
    @Column(name="start_time")
    private LocalTime startTime;
    @ManyToOne
    @JoinColumn(name = "tbl_conference_id_conference", nullable = false)
    private Conference conference;

}
