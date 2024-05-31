package com.example.hw4m3

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumb.glide.Glide;
import com.example.hw4m3.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<com.example.hw4m3.CountryModel> countryList;

    public CountryAdapter(ArrayList<com.example.hw4m3.CountryModel> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countryList.get(position));
    }


    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

class CountryViewHolder extends RecyclerView.ViewHolder {
    private ItemCountryBinding binding;

    public CountryViewHolder(@NonNull ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;

    }


    public void onBind(com.example.hw4m3.CountryModel country) {
        binding.tvCountry.setText(country.getName());
        binding.tvCapital.setText(country.getCapital());
        Glibe.with(binding.imgFlag).load(country.getFlag()).into(binding.imgFlag);
    }
}