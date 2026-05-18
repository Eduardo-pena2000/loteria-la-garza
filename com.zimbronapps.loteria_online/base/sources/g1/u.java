package G1;

import android.app.RemoteInput;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {

    public static class a {
        public static RemoteInput a(u uVar) {
            throw null;
        }
    }

    public static RemoteInput a(u uVar) {
        return a.a(uVar);
    }

    public static RemoteInput[] b(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[uVarArr.length];
        for (int i = 0; i < uVarArr.length; i++) {
            u uVar = uVarArr[i];
            remoteInputArr[i] = a(null);
        }
        return remoteInputArr;
    }
}
