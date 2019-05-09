package cn.net.jalo.school.security.bean;

import java.io.Serializable;

public class MenuMeta implements Serializable {

	private static final long serialVersionUID = 6306005637602637999L;

	private boolean keepAlive;
	
	private boolean requireAuth;

	public boolean isKeepAlive() {
		return keepAlive;
	}

	public void setKeepAlive(boolean keepAlive) {
		this.keepAlive = keepAlive;
	}

	public boolean isRequireAuth() {
		return requireAuth;
	}

	public void setRequireAuth(boolean requireAuth) {
		this.requireAuth = requireAuth;
	}
	
}
