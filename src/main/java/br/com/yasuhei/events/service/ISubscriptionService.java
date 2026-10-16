package br.com.yasuhei.events.service;

import br.com.yasuhei.events.model.Session;
import br.com.yasuhei.events.model.Subscription;
import br.com.yasuhei.events.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
}
