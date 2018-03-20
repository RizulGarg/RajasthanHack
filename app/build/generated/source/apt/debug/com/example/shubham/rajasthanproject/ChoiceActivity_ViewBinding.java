// Generated code from Butter Knife. Do not modify!
package com.example.shubham.rajasthanproject;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChoiceActivity_ViewBinding implements Unbinder {
  private ChoiceActivity target;

  @UiThread
  public ChoiceActivity_ViewBinding(ChoiceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChoiceActivity_ViewBinding(ChoiceActivity target, View source) {
    this.target = target;

    target._adminButton = Utils.findRequiredViewAsType(source, R.id.admin_choice, "field '_adminButton'", Button.class);
    target._userButton = Utils.findRequiredViewAsType(source, R.id.user_choice, "field '_userButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChoiceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target._adminButton = null;
    target._userButton = null;
  }
}
