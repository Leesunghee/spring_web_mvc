package com.ready2die.springwebmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event1 = Event.builder()
                .name("스프링 웹 MVC 스터디 1차")
                .startDateTime(LocalDateTime.of(2019, 5, 1, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 5, 1, 12, 0))
                .limitOfEnrollment(5)
                .build();

        Event event2 = Event.builder()
                .name("스프링 웹 MVC 스터디 2차")
                .startDateTime(LocalDateTime.of(2019, 5, 8, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 5, 8, 12, 0))
                .limitOfEnrollment(5)
                .build();

        List list = new ArrayList();
        list.add(event1);
        list.add(event2);
        return list;
    }

}
