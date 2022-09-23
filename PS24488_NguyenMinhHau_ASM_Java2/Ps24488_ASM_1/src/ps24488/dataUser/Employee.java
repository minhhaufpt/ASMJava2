/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ps24488.dataUser;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author NguyenMinhHau_PS24488
 */
public class Employee implements Serializable {

    public String manv, hovaten, email;
    private double luong;
    public int tuoi;
    public ImageIcon hinhanh ;

    public ImageIcon getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(ImageIcon hinhanh) {
        this.hinhanh = hinhanh;
    }

    public Employee(String manv, String hovaten, String email, double luong, int tuoi, ImageIcon hinhanh) {
        this.manv = manv;
        this.hovaten = hovaten;
        this.email = email;
        this.luong = luong;
        this.tuoi = tuoi;
        this.hinhanh = hinhanh;
    }

    

    public Employee() {
    }

    public Employee(String manv, String hovaten, String email, double luong, int tuoi) {
        this.manv = manv;
        this.hovaten = hovaten;
        this.email = email;
        this.luong = luong;
        this.tuoi = tuoi;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
