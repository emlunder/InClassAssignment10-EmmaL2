package com.example.cmltdstudent.inclassassignment10_emmal;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 4/10/17.
 */

public class Monuments implements Serializable {
    public String name;
    public String info;
    public int photoId;

    public Monuments(String name, String info, int photoId) {
        this.name = name;
        this.info = info;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getPhotoId() {
        return photoId;
    }

    @Override
    public String toString() {
        return name + "\n" + info + "\n" + photoId;
    }
}
