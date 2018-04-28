package com.designpatterns.Factory;

public class InvitationSenderFactory {

    public InvitationSender createInvitationSender(InvitationSenderType type){

       if (type.equals(InvitationSenderType.EMAIL)){
           return new EmailInvitationSender();
        } else if ( type.equals(InvitationSenderType.FAX)){
           return new FaxInvitationSender();
        } else {
           return new SMSInvitationSender();
       }
    }
}
