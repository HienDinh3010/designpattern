package design.asd.course.pattern.iterator.socialnetwork.iterators;

import design.asd.course.pattern.iterator.socialnetwork.profile.Profile;

public interface ProfileIterator {
    Profile getNext();
    boolean hasNext();

    void reset();
}
