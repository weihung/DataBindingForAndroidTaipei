package com.example.databindinglibrary;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by weihung on 16/8/3.
 */
public class User {
    private String id;
    private String name;
    private int age;
    private boolean showAge;

    public User(String id, String name, int age, boolean showAge) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.showAge = showAge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isShowAge() {
        return showAge;
    }

    public void setShowAge(boolean showAge) {
        this.showAge = showAge;
    }

    public void onClickName(View view) {
        Toast.makeText(view.getContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
    }

}
