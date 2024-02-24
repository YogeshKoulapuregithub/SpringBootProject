package com.jsp.springboot.Actor.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jsp.springboot.Actor.model.Actor;
import com.jsp.springboot.Actor.utility.ResposeStucture;

public interface ActorService {
    public ResponseEntity<ResposeStucture<Actor>> addActors(Actor actor);
    
    public ResponseEntity<ResposeStucture<Actor>> findById(int actorid);
    
    public ResponseEntity<ResposeStucture<Actor>> updateByActorId(int actorId,Actor updatedActor);
    
    public ResponseEntity<ResposeStucture<Actor>> deleteByActorId(int actorId);
    
    public ResponseEntity<ResposeStucture<Actor>> findAllRecords();

	
    
   
}
