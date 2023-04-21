package com.example.new_ergasia;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class MainActivityDirections {
  private MainActivityDirections() {
  }

  @NonNull
  public static NavDirections actionFirstFragmentToSecondFragment() {
    return new ActionOnlyNavDirections(R.id.action_FirstFragment_to_SecondFragment);
  }
}
