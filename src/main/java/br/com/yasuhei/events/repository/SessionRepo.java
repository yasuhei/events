package br.com.yasuhei.events.repository;

import br.com.yasuhei.events.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {

}
