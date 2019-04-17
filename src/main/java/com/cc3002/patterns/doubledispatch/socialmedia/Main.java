package com.cc3002.patterns.doubledispatch.socialmedia;

import com.cc3002.patterns.doubledispatch.socialmedia.influencer.Influencer;
import com.cc3002.patterns.doubledispatch.socialmedia.media.CaraBook;
import com.cc3002.patterns.doubledispatch.socialmedia.media.SocialMedia;

public class Main {

    public static void main(String[] args) {

        SocialMedia carabook = new CaraBook();
        Influencer influencer = new Influencer("Cris");
        System.out.println(influencer.getUsername());
        carabook.publishBy(influencer);

    }

}
