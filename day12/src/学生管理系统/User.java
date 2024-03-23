package 学生管理系统;

public class User {
    private String userName;
    private String passWord;
    private String personId;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String passWord, String personId, String phoneNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * 设置
     * @param personId
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "User{userName = " + userName + ", passWord = " + passWord + ", personId = " + personId + ", phoneNumber = " + phoneNumber + "}";
    }
}
