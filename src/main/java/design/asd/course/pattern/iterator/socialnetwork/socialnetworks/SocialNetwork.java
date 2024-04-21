package design.asd.course.pattern.iterator.socialnetwork.socialnetworks;

import design.asd.course.pattern.iterator.socialnetwork.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);
}
