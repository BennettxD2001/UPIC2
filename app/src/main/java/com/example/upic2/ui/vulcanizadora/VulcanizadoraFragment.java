package com.example.upic2.ui.vulcanizadora;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.upic2.databinding.FragmentVulBinding;

public class VulcanizadoraFragment extends Fragment {

    private FragmentVulBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VulcanizadoraViewModel notificationsViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(VulcanizadoraViewModel.class);

        binding = FragmentVulBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}