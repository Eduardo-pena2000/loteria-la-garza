package u4;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class m extends t4.a {
    public final JsReplyProxyBoundaryInterface a;

    public m(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return c(jsReplyProxyBoundaryInterface);
    }

    public static m b(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) Lb.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (m) jsReplyProxyBoundaryInterface.getOrCreatePeer(new l(jsReplyProxyBoundaryInterface));
    }

    public static /* synthetic */ Object c(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new m(jsReplyProxyBoundaryInterface);
    }
}
