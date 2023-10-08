/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Employee implements Serializable{
    private String HoTen , MaNV , email;
    private int Age;
    private double Luong;

    public Employee() {
    }

    public Employee(String MaNV,String HoTen, String email,double Luong, int Age ) {
        this.HoTen = HoTen;
        this.MaNV = MaNV;
        this.email = email;
        this.Age = Age;
        this.Luong = Luong;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    
    
    
    
}
