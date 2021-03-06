// Generated by view binder compiler. Do not edit!
package com.example.feature_currencyconverter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.feature_currencyconverter.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SelectedCountryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView countryCurrencyTv;

  private SelectedCountryBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView countryCurrencyTv) {
    this.rootView = rootView;
    this.countryCurrencyTv = countryCurrencyTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectedCountryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectedCountryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.selected_country, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectedCountryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.countryCurrencyTv;
      TextView countryCurrencyTv = rootView.findViewById(id);
      if (countryCurrencyTv == null) {
        break missingId;
      }

      return new SelectedCountryBinding((ConstraintLayout) rootView, countryCurrencyTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
