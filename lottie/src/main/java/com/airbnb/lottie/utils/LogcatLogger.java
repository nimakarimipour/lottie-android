package com.airbnb.lottie.utils;

import androidx.annotation.Nullable;

import android.util.Log;

import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieLogger;

import java.util.HashSet;
import java.util.Set;

public class LogcatLogger implements LottieLogger {

  /**
   * Set to ensure that we only log each message one time max.
   */
  private static final Set<String> loggedMessages = new HashSet<>();


  public void debug(String message) {
    debug(message, null);
  }

  public void debug(String message, @Nullable Throwable exception) {
    if (L.DBG) {
      Log.d(L.TAG, message, exception);
    }
  }

  public void warning(String message) {
    warning(message, null);
  }

  public void warning(String message, @Nullable Throwable exception) {
    if (loggedMessages.contains(message)) {
      return;
    }

    Log.w(L.TAG, message, exception);

    loggedMessages.add(message);
  }

  @Override public void error(String message, Throwable exception) {
    if (L.DBG) {
      Log.d(L.TAG, message, exception);
    }
  }
}
