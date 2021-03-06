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

public final class CurrencyItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView countryCurrencyTv;

  @NonNull
  public final TextView countryIsoCodeTv;

  private CurrencyItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView countryCurrencyTv, @NonNull TextView countryIsoCodeTv) {
    this.rootView = rootView;
    this.countryCurrencyTv = countryCurrencyTv;
    this.countryIsoCodeTv = countryIsoCodeTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CurrencyItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CurrencyItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.currency_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CurrencyItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.countryCurrencyTv;
      TextView countryCurrencyTv = rootView.findViewById(id);
      if (countryCurrencyTv == null) {
        break missingId;
      }

      id = R.id.countryIsoCodeTv;
      TextView countryIsoCodeTv = rootView.findViewById(id);
      if (countryIsoCodeTv == null) {
        break missingId;
      }

      return new CurrencyItemBinding((ConstraintLayout) rootView, countryCurrencyTv,
          countryIsoCodeTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
