package aaa.di;

import aaa.mmm.ContextStudData;
import jakarta.servlet.http.HttpServletRequest;

public interface StudAction {
	Object execute(HttpServletRequest request, ContextStudData data);
}
