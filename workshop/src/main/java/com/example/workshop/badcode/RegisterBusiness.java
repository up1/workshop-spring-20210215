package com.example.workshop.badcode;

import java.util.Arrays;

public class RegisterBusiness {

    public Integer register(SpeakerRepository repository, Speaker speaker) {
        Integer speakerId;
        // Fail fast
        if (isNullOrEmpty(speaker.getFirstName())) {
            throw new ArgumentNullException("First name is required.");
        }

        if (isNullOrEmpty(speaker.getLastName())) {
            throw new ArgumentNullException("Last name is required.");
        }

        if (isNullOrEmpty(speaker.getEmail())) {
            throw new ArgumentNullException("Email is required.");
        }

        // Validate email's domain
        if (checkValidDomain(speaker.getEmail())) {
            throw new SpeakerDoesntMeetRequirementsException("Speaker doesn't meet our standard rules.");
        }

        // Main :: Register process
        try {
            int exp = speaker.getExp();
            speaker.setRegistrationFee(getFee(exp));
            speakerId = repository.saveSpeaker(speaker);
        } catch (Exception exception) {
            throw new SaveSpeakerException("Can't save a speaker.");
        }


        return speakerId;
    }

    private boolean checkValidDomain(String email) {
        String[] domains = {"gmail.com", "live.com"};
        String emailDomain = getEmailDomain(email); // ArrayIndexOutOfBound
        return Arrays.stream(domains).filter(it -> it.equals(emailDomain)).count() == 0;
    }

    private boolean isNullOrEmpty(String firstName) {
        return firstName == null || firstName.trim().equals("");
    }

    int getFee(int exp) {
        int fee = 0;
        if (exp <= 1) {
            fee = 500;
        } else if (exp <= 3) {
            fee = 250;
        } else if (exp <= 5) {
            fee = 100;
        } else if (exp <= 9) {
            fee = 50;
        }
        return fee;
    }

    public String getEmailDomain(String email) {
        String[] inputs = email.trim().split("@");
        if (inputs.length == 2) return inputs[1];
        throw new DomainEmailInvalidException();
    }

}
