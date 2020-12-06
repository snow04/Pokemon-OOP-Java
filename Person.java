import java.util.*;

class Person{

    private String username;
    private String sex;

    String setUsername(String username)
    {
        this.username = username;
        return this.username;
    }

    String getUsername()
    {
        return this.username;
    }

    String setSex(String sex)
    {
        this.sex = sex;
        return this.sex;
    }

    String getSex()
    {
        return this.sex;
    }

}