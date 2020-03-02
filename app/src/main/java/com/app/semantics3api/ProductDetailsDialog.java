package com.app.semantics3api;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.app.semantics3api.databinding.DialogProductDetailsBinding;

import java.util.ArrayList;

public class ProductDetailsDialog extends AppCompatDialogFragment {
    ArrayList<SitedetailsItem> resultsItem = new ArrayList<>();
    DialogProductDetailsBinding mBinding;
    View view;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        if (view == null) {
            mBinding = DataBindingUtil.inflate(inflater, R.layout.dialog_product_details, null, false);
            view = mBinding.getRoot();
        }
        resultsItem = (ArrayList<SitedetailsItem>) getArguments().getSerializable("tar_name");
        setAdpter();

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity());
        alertBuilder.setView(view);
        AlertDialog dialog = alertBuilder.create();
        dialog.show();
        return dialog;
    }

    private void setAdpter(){
        try {
            ProductDialogAdapter madapter = new ProductDialogAdapter(getContext(),resultsItem);
            mBinding.recycler.setAdapter(madapter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
