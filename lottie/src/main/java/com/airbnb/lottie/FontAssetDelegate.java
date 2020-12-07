package com.airbnb.lottie;

import androidx.annotation.Nullable;

import android.graphics.Typeface;

@SuppressWarnings({"unused", "WeakerAccess"}) public class FontAssetDelegate {

  /**
   * Override this if you want to return a Typeface from a font family.
   */
  @Nullable
  public Typeface fetchFont(String fontFamily) {
    return null;
  }

  /**
   * Override this if you want to specify the asset path for a given font family.
   */
  @Nullable
  public String getFontPath(String fontFamily) {
    return null;
  }
}
