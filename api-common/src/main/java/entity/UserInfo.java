package entity;

import lombok.Data;

/**
 * @author 谢朝康
 * @date 2020/4/4 14:17
 * 用户信息
 */
@Data
public class UserInfo {

    private int id;
    private String password;

    private String name;

    private String gender;

    private String birthday;

    private String nationality;

    private String ID_card;

    private String political_status;

    private String address;

    private String phone;

    private String department;

    private String Major_name;

    private String Administrative_class;
    private String salt;

    public UserInfo() {
    }

    public UserInfo(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public UserInfo(String password, String salt) {
        this.password = password;
        this.salt = salt;
    }

    public UserInfo(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public UserInfo(int id, String password, String name, String salt) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.salt = salt;
    }

    public UserInfo(String name) {
        this.name = name;
    }

    public UserInfo(int id, String name, String gender, String birthday, String nationality, String ID_card,  String political_status, String address, String phone, String department, String major_name, String administrative_class) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.nationality = nationality;
        this.ID_card = ID_card;
        this.political_status = political_status;
        this.address = address;
        this.phone = phone;
        this.department = department;
        Major_name = major_name;
        Administrative_class = administrative_class;
    }

    public UserInfo(int id, String password, String name, String gender, String birthday, String nationality, String ID_card, String political_status, String address, String phone, String department, String major_name, String administrative_class, String salt) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.nationality = nationality;
        this.ID_card = ID_card;
        this.political_status = political_status;
        this.address = address;
        this.phone = phone;
        this.department = department;
        this.Major_name = major_name;
        this.Administrative_class = administrative_class;
        this.salt = salt;
    }
}
