package u4;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s implements WebMessageBoundaryInterface {
    public static final String[] a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    public static t4.f[] a(InvocationHandler[] invocationHandlerArr) {
        t4.f[] fVarArr = new t4.f[invocationHandlerArr.length];
        for (int i = 0; i < invocationHandlerArr.length; i++) {
            fVarArr[i] = new u(invocationHandlerArr[i]);
        }
        return fVarArr;
    }

    public static t4.e b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        t4.f[] a2 = a(webMessageBoundaryInterface.getPorts());
        if (!y.C.c()) {
            return new t4.e(webMessageBoundaryInterface.getData(), a2);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) Lb.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new t4.e(webMessagePayloadBoundaryInterface.getAsString(), a2);
        }
        if (type != 1) {
            return null;
        }
        return new t4.e(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a2);
    }
}
