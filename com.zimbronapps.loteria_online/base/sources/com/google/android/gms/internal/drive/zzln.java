package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzln {
    private static final zzll zztz = zzeb();
    private static final zzll zzua = new zzlm();

    public static zzll zzdz() {
        return zztz;
    }

    public static zzll zzea() {
        return zzua;
    }

    private static zzll zzeb() {
        try {
            return (zzll) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
