package com.google.android.gms.internal.firebase-auth-api;

import java.lang.reflect.Type;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzaex {
    private zzaex() {
    }

    public static Object zza(String str, Type type) throws zzacn {
        if (type == String.class) {
            try {
                zzagt zzagtVar = (zzagt) new zzagt().zza(str);
                if (zzagtVar.zzb()) {
                    return zzagtVar.zza();
                }
                throw new zzacn("No error message: " + str);
            } catch (Exception e) {
                throw new zzacn("Json conversion failed! " + e.getMessage(), e);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzaez) ((Class) type).getConstructor((Class[]) null).newInstance((Object[]) null)).zza(str);
            } catch (Exception e2) {
                throw new zzacn("Json conversion failed! " + e2.getMessage(), e2);
            }
        } catch (Exception e3) {
            throw new zzacn("Instantiation of JsonResponse failed! " + String.valueOf(type), e3);
        }
    }
}
