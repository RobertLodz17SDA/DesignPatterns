package com.designpatterns.Factory;

public class SMSInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {
        System.out.println("Send invitation via SMS : "+
        invitation.getName()+ invitation.getSurname()+invitation.getAddress());
        System.out.println(" Invitation by SMS SEND !!!");
    }
}
