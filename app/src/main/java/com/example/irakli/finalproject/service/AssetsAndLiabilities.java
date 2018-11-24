package com.example.irakli.finalproject.service;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class AssetsAndLiabilities {
    private List<Point> Points = new ArrayList<>();
    private List<Product> Assets = new ArrayList<>();
    private List<Product> Liabilities = new ArrayList<>();
    private List<Product> AvailableAmounts = new ArrayList<>();

    public List<Point> getPoints() {
        return Points;
    }

    public void setPoints(List<Point> points) {
        Points = points;
    }

    public List<Product> getAssets() {
        return Assets;
    }

    public void setAssets(List<Product> assets) {
        Assets = assets;
    }

    public List<Product> getLiabilities() {
        return Liabilities;
    }

    public void setLiabilities(List<Product> liabilities) {
        Liabilities = liabilities;
    }

    public List<Product> getAvailableAmounts() {
        return AvailableAmounts;
    }

    public void setAvailableAmounts(List<Product> availableAmounts) {
        AvailableAmounts = availableAmounts;
    }
}
