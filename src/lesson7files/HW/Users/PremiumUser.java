package lesson7files.HW.Users;

import lesson7files.HW.Interfaces_UserType.PremiumUserType;

public class PremiumUser implements PremiumUserType {
    @Override
    public String getPremiumUserStatus() {
        return "Premium Status";
    }
}