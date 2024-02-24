package com.jsp.springboot.Actor.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.springboot.Actor.exception.actorNotFoundById;
import com.jsp.springboot.Actor.model.Actor;
import com.jsp.springboot.Actor.reposatory.ActorReposatory;
import com.jsp.springboot.Actor.service.ActorService;
import com.jsp.springboot.Actor.utility.ResposeStucture;
@Service
public class ActorImpl implements ActorService{

	@Autowired
	private ActorReposatory  repo;

	@Override
	public ResponseEntity<ResposeStucture<Actor>> addActors(Actor actor) {

		Actor saveActor = repo.save(actor);

		ResposeStucture<Actor> resposeStucture=new ResposeStucture<>();
		resposeStucture.setStstusCode(HttpStatus.CREATED.value());
		resposeStucture.setMessage("Data added succusfully....!!!");
		resposeStucture.setData(saveActor);

		return new ResponseEntity<ResposeStucture<Actor>>(resposeStucture,HttpStatus.CREATED);
	}
	@Override
	public ResponseEntity<ResposeStucture<Actor>> findById(int actorId) {

		Optional<Actor> optional = repo.findById( actorId);

		if (optional.isPresent()) {
			Actor actor = optional.get();
			ResposeStucture<Actor> responseStucture=new ResposeStucture<>();
			responseStucture.setStstusCode(HttpStatus.FOUND.value());
			responseStucture.setMessage("SeccusFully fetched");
			responseStucture.setData(actor);
			return new ResponseEntity<ResposeStucture<Actor>>(responseStucture,HttpStatus.FOUND);
		} else {
			throw new actorNotFoundById("Actor not found...!!!");
		}
	}
	@Override
	public ResponseEntity<ResposeStucture<Actor>> updateByActorId(int actorId,Actor updatedActor) {
		Optional<Actor> optional = repo.findById(actorId);

		if (optional.isPresent()) {
			Actor exstindActor = optional.get();
			updatedActor.setActorId(exstindActor.getActorId());
			ResposeStucture<Actor> responseStucture=new ResposeStucture<>();
			responseStucture.setStstusCode(HttpStatus.OK.value());
			responseStucture.setMessage("Updated SeccusFully ");
			responseStucture.setData(updatedActor);
			return new ResponseEntity<ResposeStucture<Actor>>(responseStucture,HttpStatus.OK);

		}    else {
			return null;
		}
	}
	@Override
	public ResponseEntity<ResposeStucture<Actor>> deleteByActorId(int actorId) {
		Optional<Actor> optional = repo.findById(actorId);

		if (optional.isPresent()) {
			Actor actor = optional.get();
			ResposeStucture<Actor> responseStucture=new ResposeStucture<>();
			responseStucture.setStstusCode(HttpStatus.OK.value());
			responseStucture.setMessage("Updated SeccusFully ");
			responseStucture.setData(actor);
			return new ResponseEntity<ResposeStucture<Actor>>(responseStucture,HttpStatus.OK);

		} else {
			return null;
		}
	}
	@Override
	public ResponseEntity<ResposeStucture<Actor>> findAllRecords() {
		List<Actor> all = repo.findAll();
		
		if (all.isEmpty()) {
			return null;
		}
		else {

			ResposeStucture<Actor> resposeStucture=new ResposeStucture<>();
			resposeStucture.setStstusCode(HttpStatus.FOUND.value());
			resposeStucture.setMessage("Found All Records....!!!!!ss");
			resposeStucture.setList(all);

			return new ResponseEntity<ResposeStucture<Actor>>(resposeStucture,HttpStatus.FOUND);
		}
	}
}


