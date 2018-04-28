package com.designpatterns.Factory;

public class EmailInvitationSender implements InvitationSender {


    public void sendInvitation(Invitation invitation) {
        System.out.println("Send invitation via Email : "+
                invitation.getName()+ invitation.getSurname()+invitation.getAddress());
        System.out.println(" Invitation via EMAIL SEND !!!");
    }
}
