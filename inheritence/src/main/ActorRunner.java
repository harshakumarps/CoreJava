package main;

import com.xworkz.people.Actor;

public class ActorRunner {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.breathe();
        actor.speak();
        actor.act();
    }
}
