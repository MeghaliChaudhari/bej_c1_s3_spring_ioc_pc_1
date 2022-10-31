package org.example.domain;

public class Department {
    private int dptId;
    private String dptName;

    public Department(int dptId, String dptName) {
        this.dptId = dptId;
        this.dptName = dptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dptId=" + dptId +
                ", dptName='" + dptName + '\'' +
                '}';
    }
}
