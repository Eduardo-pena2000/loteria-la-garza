package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdv {
    public static boolean zza(Context context) throws zzdu {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzg("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzb() throws zzdu {
        return zzg("EGL_KHR_surfaceless_context");
    }

    public static boolean zzc(int i) throws zzdu {
        if (i == 6) {
            return zzd();
        }
        if (i == 7) {
            return zzg("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean zzd() throws zzdu {
        return Build.VERSION.SDK_INT >= 33 && zzg("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void zze() throws zzdu {
        StringBuilder sb = new StringBuilder();
        zzguc zzgucVar = new zzguc();
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
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            zzgucVar.zzf(Integer.valueOf(glGetError));
            z = true;
        }
        if (z) {
            throw new zzdu(sb.toString(), zzgucVar.zzi());
        }
    }

    public static void zzf(boolean z, String str) throws zzdu {
        if (!z) {
            throw new zzdu(str, zzguf.zzi());
        }
    }

    private static boolean zzg(String str) throws zzdu {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        zzf(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zzf(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        zze();
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }
}
