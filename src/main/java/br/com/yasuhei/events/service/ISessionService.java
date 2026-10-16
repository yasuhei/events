package br.com.yasuhei.events.service;

import br.com.yasuhei.events.model.Session;

import java.util.List;

public interface ISessionService {
    public Session addSession(Session session);
    public Session getSessionById(Integer id);
    public List<Session> getAllSessions();
}
