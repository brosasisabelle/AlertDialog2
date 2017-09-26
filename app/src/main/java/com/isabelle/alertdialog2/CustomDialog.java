package com.isabelle.alertdialog2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Isabelle on 9/26/2017.
 */

public class CustomDialog extends DialogFragment {
    LayoutInflater inflater;
    View v;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.custom_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v)
                .setCancelable(true)
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getActivity(), "Ok was clicked", Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }

    public void show(FragmentManager supportFragmentManager, String custom_dialog) {
    }
}