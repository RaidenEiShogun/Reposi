package lesson7files.HW.Users;

import lesson7files.HW.Interfaces.UserType;

public class PremiumUser implements UserType {
    @Override
    public String getUserStatus() {
        return "Premium Status";
    }
}
