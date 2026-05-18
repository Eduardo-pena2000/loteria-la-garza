package u4;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class q implements t4.d {
    public final ScriptHandlerBoundaryInterface a;

    public q(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.a = scriptHandlerBoundaryInterface;
    }

    public static q a(InvocationHandler invocationHandler) {
        return new q((ScriptHandlerBoundaryInterface) Lb.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
