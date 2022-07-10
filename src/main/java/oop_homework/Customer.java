package oop_homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Customer {
    @Getter
    public String name;
    @Getter
    @Setter
    public boolean member = false;
    @Getter
    @Setter
    public String memberType;
public class Customers {
    public String name;
    public boolean member = false;
    public String memberType;
}
public Customer(String name) {
    this.name = name;
}

    public String getName() {
    return name;
}
public boolean isMember(){
    return member;
}
public void setMember(boolean member) {
    this.member = member;
}
public String getMemberType() {
    return memberType;
}
public void setMemberType(String type) {
    this.memberType = memberType;
}

}
