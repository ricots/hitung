package com.acer.labkom.HitungBangunRuangDanDatar.BangunRuang.LimasSegiEmpat;

import com.acer.labkom.HitungBangunRuangDanDatar.BangunDatar.Segitiga.LuasSegitiga;

/**
 * Created by Irham Dzuhri on 26/11/2016.
 */

public class LuasSisiTegakLimasSegiEmpat extends LuasSegitiga {
    public LuasSisiTegakLimasSegiEmpat(double a, double t) {
        super(a, t);
    }

    public double hitung_luas_sisi_tegak(){
        return super.hitung_luas();
    }
}
