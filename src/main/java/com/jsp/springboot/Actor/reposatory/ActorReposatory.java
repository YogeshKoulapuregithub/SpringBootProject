package com.jsp.springboot.Actor.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.jsp.springboot.Actor.model.Actor;
@Repository
public interface ActorReposatory extends JpaRepository<Actor, Integer>{

}
