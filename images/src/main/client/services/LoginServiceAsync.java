package main.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import main.shared.LoginInfo;

public interface LoginServiceAsync {
  public void login(String requestUri, AsyncCallback<LoginInfo> async);
}