package design.asd.course.pattern.iterator.socialnetwork.iterators;

import design.asd.course.pattern.iterator.socialnetwork.socialnetworks.Facebook;
import design.asd.course.pattern.iterator.socialnetwork.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {

    private Facebook facebook;

    private String email;

    private String type;

    private int currentPosition;

    private List<String> emails = new ArrayList<>();

    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.email = email;
        this.type = type;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile: profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
