package lesson7files.HW.Users;

import lesson7files.HW.Interfaces_UserType.RegularUserType;

public class RegularUser implements RegularUserType {
    @Override
    public String getRegularUserStatus() {
        return "Regular Status";
    }
}
