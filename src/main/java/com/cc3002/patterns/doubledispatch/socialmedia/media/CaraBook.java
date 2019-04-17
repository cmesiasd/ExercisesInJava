package com.cc3002.patterns.doubledispatch.socialmedia.media;

import com.cc3002.patterns.doubledispatch.socialmedia.influencer.User;

public class CaraBook implements SocialMedia {
    @Override
    public void publishBy(User user) {
        user.publishOnCaraBook(this);
    }

    public void publishRant() {
        System.out.println("CB.publishRant");
    }

    public void marketing() {
        System.out.println("CB.marketing");
    }

    public void publishLifeEvent() {
        System.out.println("CB.publishLifeEvent");
    }
}
