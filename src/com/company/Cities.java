package com.company;

import java.util.Objects;

public class Cities  implements Comparable{
    int code;
    String name;

    public Cities(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities = (Cities) o;
        return code == cities.code &&
                Objects.equals(name, cities.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public int compareTo(Object o) {
        Cities city = (Cities) o;
        return 0;
    }

    @Override
    public String toString(){
        return "Code of city: " + this.code + " - Name of city: " + this.name;
    }
}
