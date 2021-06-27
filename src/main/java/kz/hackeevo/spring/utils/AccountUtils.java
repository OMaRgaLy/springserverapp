package kz.hackeevo.spring.utils;

import kz.hackeevo.spring.entity.Account;
import kz.hackeevo.spring.entity.Bill;
import kz.hackeevo.spring.exceptions.NotDefaultBillException;

public class AccountUtils {
    public static Bill findDefaultBill(Account account) {
        return account.getBills().stream()
                .filter(Bill::getDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("Unable to find default bill for account: " + account.getAccountId()));
    }
}
