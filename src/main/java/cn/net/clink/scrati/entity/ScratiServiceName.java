package cn.net.clink.scrati.entity;

public interface ScratiServiceName {

    String ACCOUNT_BALANCE_QUERY = "account.balance.query";
    String ACCOUNT_BALANCE_PAY = "account.balance.pay";
    String ACCOUNT_BALANCE_PAY_QUERY = "account.balance.pay.query";

    String SCANPAY_ORDER_CREATE = "scanpay.order.create";
    String SCANPAY_ORDER_QUERY = "scanpay.order.query";

    String QUICKPAY_ORDER_CREATE = "quickpay.order.create";
    String QUICKPAY_ORDER_CONFIRM = "quickpay.order.confirm";
    String QUICKPAY_ORDER_QUERY = "quickpay.order.query";

    String GATEWAY_ORDER_CREATE = "gateway.order.create";
    String GATEWAY_ORDER_QUERY = "gateway.order.query";

    String INDIVIDUAL_MCH_CREATE = "individual.mch.create";
    String INDIVIDUAL_MCH_QUERY = "individual.mch.query";
    String INDIVIDUAL_MCH_PRODUCT_CREATE = "individual.mch.product.create";
    String INDIVIDUAL_MCH_PRODUCT_UPDATE = "individual.mch.product.update";
    String INDIVIDUAL_MCH_SETTLEMENT_UPDATE = "individual.mch.settlement.update";

}
