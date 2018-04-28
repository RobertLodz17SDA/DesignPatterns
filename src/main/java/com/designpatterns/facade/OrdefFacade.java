package com.designpatterns.facade;

public class OrdefFacade {

    private SaveOrderService saveOrderService;
    private SendEmailToUserService sendEmailToUserService;
    private SendSMSToDriverService sendSMSToDriverService;
    private GenerateBillService generateBillService;

    public OrdefFacade() {
        this.saveOrderService = new SaveOrderService();
        this.sendEmailToUserService = new SendEmailToUserService();
        this.sendSMSToDriverService = new SendSMSToDriverService();
        this.generateBillService = new GenerateBillService();
    }

    public void processOrder(Order order){
        saveOrderService.saveOrder(order);
        sendEmailToUserService.sendEmailToUser();
        sendSMSToDriverService.sendSMSToDriver();
        generateBillService.generateBill();
    }


}
