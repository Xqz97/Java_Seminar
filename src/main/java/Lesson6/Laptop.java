package Lesson6;

import java.util.Objects;

public class Laptop {
    String name;
    String cpu;
    int dram;
    String os;
    int ssd;
    int price;

    public int getprice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCpu() {
        return cpu;
    }

    public int getDram() {
        return dram;
    }

    public String getOs() {
        return os;
    }

    public int getSsd() {
        return ssd;
    }

    public Laptop(String name, String cpu, String os, int ssd, int dram, int price) {
        this.name = name;
        this.cpu = cpu;
        this.dram = dram;
        this.os = os;
        this.ssd = ssd;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        strb.append(name).append(" ").append(cpu).append(" ").append(os).append(" ").append(ssd).append("GB ")
                .append(dram).append("GB ").append(price).append("руб.");
        return strb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpu, os, ssd, dram, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Laptop)) {
            return false;
        }
        Laptop temp = (Laptop) obj;
        return temp.name.equals(this.name) && temp.cpu.equals(this.cpu) && temp.os.equals(this.os)
                && temp.ssd == this.ssd && temp.dram == this.dram && temp.price == this.price;
    }
}
