package com.designpatterns.Factory;

public class FaxInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {
        System.out.println("Send invitation via FAX : "+
                invitation.getName()+ invitation.getSurname()+invitation.getAddress());
        System.out.println(" Invitation byy FAX send !!!");
    }
}
