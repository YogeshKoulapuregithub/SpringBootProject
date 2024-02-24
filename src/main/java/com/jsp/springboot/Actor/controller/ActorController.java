package com.jsp.springboot.Actor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot.Actor.model.Actor;
import com.jsp.springboot.Actor.service.ActorService;
import com.jsp.springboot.Actor.utility.ResposeStucture;

//@Controller
//@ResponseBody
@RestController
public class ActorController {

	@Autowired
	private ActorService service;

	//@RequestMapping(method = RequestMethod.POST,value = "/addactor")
	@PostMapping(value = "/actors/addActor")
	public ResponseEntity<ResposeStucture<Actor>> addActor(@RequestBody Actor actor)
	{

		return service.addActors(actor);

	}
	//@RequestMapping(method = RequestMethod.GET,value = "/actor/findById")
	@GetMapping(value = "/acotrs/findById/{actorId}")
	public ResponseEntity<ResposeStucture<Actor>> findById(@RequestParam int actorId)
	{
		return service.findById(actorId);

	}
	//@RequestMapping(method = RequestMethod.PUT ,value = "/actors/update")
	@PutMapping(value = "/actors/update")
	public ResponseEntity<ResposeStucture<Actor>> updateByActorId(@RequestParam int actorId,@RequestBody Actor actor)
	{
		return service.updateByActorId(actorId, actor);

	}

	//@RequestMapping(method = RequestMethod.DELETE,value = "/actor/Delete")
	@DeleteMapping(value = "/actor/delete")
	public ResponseEntity<ResposeStucture<Actor>> deleteByActorId(@RequestParam int actorId)
	{
		return service.deleteByActorId(actorId);
	}
	//@RequestMapping(method = RequestMethod.GET ,value = "/actor/findAllActors")
	@GetMapping(value = "/actor/findAllActors")
	public ResponseEntity<ResposeStucture<Actor>> findAllRecords()
	{
		return service.findAllRecords();

	}

	//		@RequestMapping(value = "/print",method = RequestMethod.GET)
	//		public String print(@RequestParam String name,@RequestParam String city)
	//		{
	//			return name+" Belongs to "+city;
	//
	//		}
	//		@RequestMapping(value = "/addNum",method = RequestMethod.GET)
	//		public int calculate(@RequestParam int num1,@RequestParam int num2)
	//		{
	//			int sum=num1+num2;
	//			return sum;
	//
	//		}

}
