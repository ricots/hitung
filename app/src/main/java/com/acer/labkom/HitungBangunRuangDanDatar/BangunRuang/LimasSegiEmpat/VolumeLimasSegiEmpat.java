package com.acer.labkom.HitungBangunRuangDanDatar.BangunRuang.LimasSegiEmpat;

/**
 * Created by Irham Dzuhri on 26/11/2016.
 */

public class VolumeLimasSegiEmpat {
    double luas_alas;
    double tinggi;

    public VolumeLimasSegiEmpat(double la, double t) {
        luas_alas = la;
        tinggi = t;
    }

    public double hitung_volume() {
        return 1.0 / 4 * luas_alas * tinggi;
    }
}


