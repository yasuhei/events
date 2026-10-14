package br.com.yasuhei.events.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class SubscriptId {
    @ManyToOne
    @JoinColumn(name = "subscribed_user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

}
