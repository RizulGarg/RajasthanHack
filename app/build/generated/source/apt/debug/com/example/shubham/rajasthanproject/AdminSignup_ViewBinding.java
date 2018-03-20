// Generated code from Butter Knife. Do not modify!
package com.example.shubham.rajasthanproject;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdminSignup_ViewBinding implements Unbinder {
  private AdminSignup target;

  @UiThread
  public AdminSignup_ViewBinding(AdminSignup target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AdminSignup_ViewBinding(AdminSignup target, View source) {
    this.target = target;

    target._nameText = Utils.findRequiredViewAsType(source, R.id.admin_input_name, "field '_nameText'", EditText.class);
    target._IDText = Utils.findRequiredViewAsType(source, R.id.admin_input_id, "field '_IDText'", EditText.class);
    target._passwordText = Utils.findRequiredViewAsType(source, R.id.admin_input_password, "field '_passwordText'", EditText.class);
    target._reEnterPasswordText = Utils.findRequiredViewAsType(source, R.id.admin_input_reEnterPassword, "field '_reEnterPasswordText'", EditText.class);
    target._signupButton = Utils.findRequiredViewAsType(source, R.id.admin_btn_signup, "field '_signupButton'", Button.class);
    target._loginLink = Utils.findRequiredViewAsType(source, R.id.admin_link_login, "field '_loginLink'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdminSignup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target._nameText = null;
    target._IDText = null;
    target._passwordText = null;
    target._reEnterPasswordText = null;
    target._signupButton = null;
    target._loginLink = null;
  }
}
