package com.acer.labkom.HitungBangunRuangDanDatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial();

    }

    private void initial() {

    }

    public void persegiPanjang(View view) {
        Intent intent = new Intent(MainActivity.this, HitungPersegiPanjangActivity.class);
        startActivity(intent);
    }

    public void balok(View view) {
        Intent intent = new Intent(MainActivity.this, HitungBalokActivity.class);
        startActivity(intent);
    }

    public void lingkaran(View view) {
        Intent intent = new Intent(MainActivity.this, HitungLingkaranActivity.class);
        startActivity(intent);
    }

    public void Bola(View view) {
        Intent intent = new Intent(MainActivity.this, HitungBolaActivity.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void tabung(View view) {
        Intent intent = new Intent(MainActivity.this, HitungTabungActivity.class);
        startActivity(intent);
    }

    public void kerucut(View view) {
        Intent intent = new Intent(MainActivity.this, HitungKerucutActivity.class);
        startActivity(intent);
    }

    public void pilihBangunRuang(View view) {
        Intent intent = new Intent(MainActivity.this, PilihBangunRuangActivity.class);
        startActivity(intent);
    }

    public void pilihBangunDatar(View view) {
        Intent intent = new Intent(MainActivity.this, PilihBangunDatarActivity.class);
        startActivity(intent);
    }

    /*public void share(View view) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Aplikasi Hitung Bangun Ruang dan Bangun Datar");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }*/
}