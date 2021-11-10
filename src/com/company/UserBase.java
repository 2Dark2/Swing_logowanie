package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UserBase {
    //uzywamy danej lisy aby w przyszlosci uzytkownicy sie nie powtarzali
    private static HashSet<User> userlist = new LinkedHashSet<>();

    public UserBase() {
        userlist.add(new User("jan", "kowalski"));
        userlist.add(new User("pan222", "qwerty12345"));

    }
    //metoda ktora sprawdzaczy login i haslo znajduje się w bazie uzytkownikow
    public boolean confirm(String login, String password) {
        for (User item : userlist) {
            if (login.equals(item.getLogin()))
                if (password.equals(item.getPassword())) {
                    return true;
            }
        }
        return false;
    }
}