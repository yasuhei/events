package br.com.yasuhei.events.service;

import br.com.yasuhei.events.exception.NotFoundException;
import br.com.yasuhei.events.model.Conference;
import br.com.yasuhei.events.repository.ConferenceRepo;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceServiceImpl implements IConferenceService {
    private ConferenceRepo repo;

    public ConferenceServiceImpl(ConferenceRepo repo) {
        this.repo = repo;
    }

    @Override
    public Conference addConference(Conference conference) {
        return repo.save(conference);
    }

    @Override
    public Conference getConferenceById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Conference not found with id: " + id));
    }

    @Override
    public List<Conference> getAllConferences() {
        return repo.findAll();
    }
}
