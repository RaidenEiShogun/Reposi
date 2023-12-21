package lesson7files.HW.Users;

import lesson7files.HW.Interfaces.UserType;

public class RegularUser implements UserType {
    @Override
    public String getUserStatus() {
        return "Regular Status";
    }
}
