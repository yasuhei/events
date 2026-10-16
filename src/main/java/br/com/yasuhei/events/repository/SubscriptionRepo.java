package br.com.yasuhei.events.repository;

import br.com.yasuhei.events.model.Session;
import br.com.yasuhei.events.model.Subscription;
import br.com.yasuhei.events.model.SubscriptionID;
import br.com.yasuhei.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}
