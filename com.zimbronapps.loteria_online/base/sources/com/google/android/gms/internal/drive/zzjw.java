package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjw {
    private static final Class zzok = zzce();

    private static Class zzce() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzjx zzcf() {
        if (zzok != null) {
            try {
                return zzn("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzjx.zzoo;
    }

    public static zzjx zzcg() {
        zzjx zzn;
        if (zzok != null) {
            try {
                zzn = zzn("loadGeneratedRegistry");
            } catch (Exception unused) {
            }
        } else {
            zzn = null;
        }
        if (zzn == null) {
            zzn = zzjx.zzcg();
        }
        return zzn == null ? zzcf() : zzn;
    }

    private static final zzjx zzn(String str) throws Exception {
        return (zzjx) zzok.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
    }
}
