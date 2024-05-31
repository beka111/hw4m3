package com.example.hw4m3.;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4m3.databinding.FragmentContinentBinding;
import com.example.hw4m3.databinding.FragmentCountryBinding;

import java.util.ArrayList;

import hw4m3.ContinentAdapter;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<com.example.hw4m3.CountryModel> countryList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hw4m3.ContinentAdapter countryAdapter = new ContinentAdapter(countryList);
        assert getArguments() != null;
        String argument = getArguments().getString("Continent");
        assert argument != null;
        loadData(argument);
        binding.rvCountry.setAdapter(countryAdapter);
    }

    public void loadData(String argument) {
        switch (argument) {
            case "Eurasia":
                countryList.add(new com.example.hw4m3.CountryModel("France", "https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png", "Paris"));
                countryList.add(new com.example.hw4m3.CountryModel("Ukraine", "https://upload.wikimedia.org/wikipedia/commons/d/d2/Flag_of_Ukraine.png?20220225144202", "Kiev"));
                countryList.add(new com.example.hw4m3.CountryModel("Germany", "https://upload.wikimedia.org/wikipedia/commons/3/3d/Flag_of_germany_800_480.png", "Berlin"));
                countryList.add(new com.example.hw4m3.CountryModel("Poland", "https://upload.wikimedia.org/wikipedia/commons/a/aa/Poland_flag_300.png", "Warsaw"));
                countryList.add(new com.example.hw4m3.CountryModel("Switzerland", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Flag_of_Switzerland_%28Pantone%29.svg/255px-Flag_of_Switzerland_%28Pantone%29.svg.png", "Bern"));
                break;
            case "Africa":
                countryList.add(new com.example.hw4m3.CountryModel("Nigeria", "https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Nigeria.png", "Abuja"));
                countryList.add(new com.example.hw4m3.CountryModel("Egypt", "https://upload.wikimedia.org/wikipedia/commons/1/10/Egypt_flag_300.png", "Cairo"));
                countryList.add(new com.example.hw4m3.CountryModel("Kenya", "https://upload.wikimedia.org/wikipedia/commons/9/98/Flag_of_Kenya.png", "Nairobi"));

                countryList.add(new com.example.hw4m3.CountryModel("Algeria", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeF_SNbNZlD3n4sqm051v2F87KhAB_TDaUbNiJ4TClMw&s", "Algiers"));
                countryList.add(new com.example.hw4m3.CountryModel("Sudan", "https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Sudan.png", "Khartoum"));

                break;
            case "Australia":
                countryList.add(new com.example.hw4m3.CountryModel("Australia", "https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/Flag_of_Australia.svg/1200px-Flag_of_Australia.svg.png?20190118170740", "Canberra"));
                break;
            case "North America":
                countryList.add(new com.example.hw4m3.CountryModel("USA", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_the_United_States.png/1280px-Flag_of_the_United_States.png", "Washington"));
                countryList.add(new com.example.hw4m3.CountryModel("Mexico", "https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png", "Mexico City"));
                countryList.add(new com.example.hw4m3.CountryModel("Canada", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Flag_of_Canada.png/1200px-Flag_of_Canada.png", "Ottawa"));
                countryList.add(new com.example.hw4m3.CountryModel("Jamaica", "https://upload.wikimedia.org/wikipedia/commons/b/b4/Flag_of_Jamaica.png", "Kingston"));
                countryList.add(new com.example.hw4m3.CountryModel("Cuba", "https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png", "Havana"));

                break;
            case "South America":
                countryList.add(new com.example.hw4m3.CountryModel("Brazil", "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png", "Brasília"));
                countryList.add(new com.example.hw4m3.CountryModel("Colombia", "https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png", "Bogotá"));
                countryList.add(new com.example.hw4m3.CountryModel("Argentina", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/1280px-Flag_of_Argentina.svg.png", "Buenos Aires"));
                countryList.add(new com.example.hw4m3.CountryModel("Uruguay", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/383px-Flag_of_Uruguay.svg.png", "Montevideo"));
                countryList.add(new com.example.hw4m3.CountryModel("Ecuador", "https://upload.wikimedia.org/wikipedia/commons/9/96/Flag_of_Ecuador.png", "Quito"));
                break;
        }
    }
}