package uk.dsxt.voting.common.datamodel.walletapi;

public enum WalletRequestType {

    GET_BALANCE ("getBalance"),
    GET_ACCOUNT_ID ("getAccountId"),
    SEND_MESSAGE("sendMessage"),
    SEND_MONEY("sendMoney"),
    GET_PRUNABLE_MESSAGES("getPrunableMessages"),
    READ_MESSAGE("readMessage"),
    GET_BLOCK("getBlock");

    private final String strValue;

    WalletRequestType(String strValue) {
        this.strValue = strValue;
    }

    @Override
    public String toString() {
        return strValue;
    }
}
