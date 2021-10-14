// Generated by view binder compiler. Do not edit!
package com.example.feature_currencyconverter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.feature_currencyconverter.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemErrorMessageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView_;

  @NonNull
  public final Button btnRetry;

  @NonNull
  public final TextView messageTv;

  @NonNull
  public final ConstraintLayout rootView;

  @NonNull
  public final TextView titleTv;

  private ItemErrorMessageBinding(@NonNull ConstraintLayout rootView_, @NonNull Button btnRetry,
      @NonNull TextView messageTv, @NonNull ConstraintLayout rootView, @NonNull TextView titleTv) {
    this.rootView_ = rootView_;
    this.btnRetry = btnRetry;
    this.messageTv = messageTv;
    this.rootView = rootView;
    this.titleTv = titleTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView_;
  }

  @NonNull
  public static ItemErrorMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemErrorMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_error_message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemErrorMessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_retry;
      Button btnRetry = rootView.findViewById(id);
      if (btnRetry == null) {
        break missingId;
      }

      id = R.id.message_tv;
      TextView messageTv = rootView.findViewById(id);
      if (messageTv == null) {
        break missingId;
      }

      ConstraintLayout rootView_ = (ConstraintLayout) rootView;

      id = R.id.title_tv;
      TextView titleTv = rootView.findViewById(id);
      if (titleTv == null) {
        break missingId;
      }

      return new ItemErrorMessageBinding((ConstraintLayout) rootView, btnRetry, messageTv,
          rootView_, titleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}