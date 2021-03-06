package com.cc3002.patterns.doubledispatch.socialmedia.media;

import com.cc3002.patterns.doubledispatch.socialmedia.influencer.User;

public class AhoraGram implements SocialMedia {
    @Override
    public void publishBy(User user) {
        user.publishOnAhoraGram(this);
    }

    public void publishStory() {
        // blabla
    }

    public void publishVideo() {
        // blabla
    }

    public void publishPhoto() {
        // blabla
    }
}
