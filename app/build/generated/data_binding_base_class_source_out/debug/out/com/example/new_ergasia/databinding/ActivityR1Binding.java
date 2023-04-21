// Generated by view binder compiler. Do not edit!
package com.example.new_ergasia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.new_ergasia.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityR1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout AFMR1;

  @NonNull
  public final BottomNavigationView BottomNav;

  @NonNull
  public final LinearLayout adressR1;

  @NonNull
  public final Button createButton;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView locationIcon;

  @NonNull
  public final EditText locationText;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final ImageView nameIcon;

  @NonNull
  public final LinearLayout nameR1;

  @NonNull
  public final EditText nameText;

  @NonNull
  public final EditText passText;

  @NonNull
  public final TextView titleR1;

  private ActivityR1Binding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout AFMR1,
      @NonNull BottomNavigationView BottomNav, @NonNull LinearLayout adressR1,
      @NonNull Button createButton, @NonNull ImageView imageView4, @NonNull ImageView locationIcon,
      @NonNull EditText locationText, @NonNull ImageView logo, @NonNull ImageView nameIcon,
      @NonNull LinearLayout nameR1, @NonNull EditText nameText, @NonNull EditText passText,
      @NonNull TextView titleR1) {
    this.rootView = rootView;
    this.AFMR1 = AFMR1;
    this.BottomNav = BottomNav;
    this.adressR1 = adressR1;
    this.createButton = createButton;
    this.imageView4 = imageView4;
    this.locationIcon = locationIcon;
    this.locationText = locationText;
    this.logo = logo;
    this.nameIcon = nameIcon;
    this.nameR1 = nameR1;
    this.nameText = nameText;
    this.passText = passText;
    this.titleR1 = titleR1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityR1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityR1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_r1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityR1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AFM_r1;
      LinearLayout AFMR1 = ViewBindings.findChildViewById(rootView, id);
      if (AFMR1 == null) {
        break missingId;
      }

      id = R.id.BottomNav;
      BottomNavigationView BottomNav = ViewBindings.findChildViewById(rootView, id);
      if (BottomNav == null) {
        break missingId;
      }

      id = R.id.adress_r1;
      LinearLayout adressR1 = ViewBindings.findChildViewById(rootView, id);
      if (adressR1 == null) {
        break missingId;
      }

      id = R.id.create_button;
      Button createButton = ViewBindings.findChildViewById(rootView, id);
      if (createButton == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.location_icon;
      ImageView locationIcon = ViewBindings.findChildViewById(rootView, id);
      if (locationIcon == null) {
        break missingId;
      }

      id = R.id.location_text;
      EditText locationText = ViewBindings.findChildViewById(rootView, id);
      if (locationText == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.name_icon;
      ImageView nameIcon = ViewBindings.findChildViewById(rootView, id);
      if (nameIcon == null) {
        break missingId;
      }

      id = R.id.name_r1;
      LinearLayout nameR1 = ViewBindings.findChildViewById(rootView, id);
      if (nameR1 == null) {
        break missingId;
      }

      id = R.id.name_text;
      EditText nameText = ViewBindings.findChildViewById(rootView, id);
      if (nameText == null) {
        break missingId;
      }

      id = R.id.pass_text;
      EditText passText = ViewBindings.findChildViewById(rootView, id);
      if (passText == null) {
        break missingId;
      }

      id = R.id.title_r1;
      TextView titleR1 = ViewBindings.findChildViewById(rootView, id);
      if (titleR1 == null) {
        break missingId;
      }

      return new ActivityR1Binding((ConstraintLayout) rootView, AFMR1, BottomNav, adressR1,
          createButton, imageView4, locationIcon, locationText, logo, nameIcon, nameR1, nameText,
          passText, titleR1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
