package P2;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] c = {12445, 13120, 12344, 12344};
    public static final int[] d = {12445, 13632, 12344, 12344};
    public static final int[] e = {12344};

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void a() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new a(sb.toString());
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new a(str);
        }
    }

    public static boolean c(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean d(Context context) {
        int i = K.a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(K.c) || "XT1650".equals(K.d))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return c("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean e() {
        return c("EGL_KHR_surfaceless_context");
    }
}
