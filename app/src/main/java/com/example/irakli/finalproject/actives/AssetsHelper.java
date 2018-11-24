package com.example.irakli.finalproject.actives;

import com.example.irakli.finalproject.service.AssetsAndLiabilities;

import java.util.ArrayList;
import java.util.List;

public class AssetsHelper {
    private List<Object> allAssetsAndLiabilities;
    public AssetsHelper(AssetsAndLiabilities assetsAndLiabilities){
        allAssetsAndLiabilities = new ArrayList<>();

        allAssetsAndLiabilities.add("Points");
        allAssetsAndLiabilities.addAll(assetsAndLiabilities.getPoints());

        allAssetsAndLiabilities.add("Assets");
        allAssetsAndLiabilities.addAll(assetsAndLiabilities.getAssets());

        allAssetsAndLiabilities.add("Liabilities");
        allAssetsAndLiabilities.addAll(assetsAndLiabilities.getLiabilities());

        allAssetsAndLiabilities.add("AvailableAmounts");
        allAssetsAndLiabilities.addAll(assetsAndLiabilities.getAvailableAmounts());

    }

    public int getCount(){
        return allAssetsAndLiabilities.size();
    }

    public Object getItem(int index){
        return allAssetsAndLiabilities.get(index);
    }


}
