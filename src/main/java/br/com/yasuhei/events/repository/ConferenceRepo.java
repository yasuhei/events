package br.com.yasuhei.events.repository;

import br.com.yasuhei.events.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer> {

}
