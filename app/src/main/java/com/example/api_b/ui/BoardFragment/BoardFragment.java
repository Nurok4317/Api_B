package com.example.api_b.ui.BoardFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.viewpager2.widget.ViewPager2;

import com.example.api_b.Prefs;
import com.example.api_b.databinding.FragmentBoardBinding;
import com.example.api_b.databinding.FragmentNotificationsBinding;

public class BoardFragment extends Fragment {

    private FragmentBoardBinding binding;

    ViewPager2 viewPager2;

    NavController navController;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBoardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        new Prefs(requireContext()).saveBoardState();

        binding.viewPager2.registerOnPageChan

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}