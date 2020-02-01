package com.yoga.classservice.controller;

import com.yoga.classservice.model.Event;
import com.yoga.classservice.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventDetailsController {

    @Autowired
    EventService eventService;

    @RequestMapping({"/{eventId}"})
    public Event getEvent(@PathVariable("eventId") Long eventId) {
        return  eventService.getEventById(eventId);
    }

    @PostMapping
    public void addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }


//    @RequestMapping("/{classId}")
//    public ClassDetail getClassDetail(@PathVariable("classId") int classId) {
//        return new ClassDetail(1,"This class fucks!!!");
//    }
}
