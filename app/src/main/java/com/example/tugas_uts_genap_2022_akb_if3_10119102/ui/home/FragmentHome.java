package com.example.tugas_uts_genap_2022_akb_if3_10119102.ui.home;

/*
 * NIM : 10119102
 *Nama : Muhammad Alfiqh Nugraha
 *Kelas : if3
 *Email : m.alfiqnugraha@gmail.com
 * */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import com.example.tugas_uts_genap_2022_akb_if3_10119102.R;

public class FragmentHome extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
