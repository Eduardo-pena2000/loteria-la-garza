package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzoc extends LinkedHashMap {
    private static final zzoc zza;
    private boolean zzb;

    static {
        zzoc zzocVar = new zzoc();
        zza = zzocVar;
        zzocVar.zzb = false;
    }

    private zzoc() {
        this.zzb = true;
    }

    public static zzoc zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zznf) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = zznl.zzb;
        int length = bArr.length;
        int zzb = zznl.zzb(length, bArr, 0, length);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        zzg();
        byte[] bArr = zznl.zzb;
        obj.getClass();
        obj2.getClass();
        return super/*java.util.AbstractMap*/.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            byte[] bArr = zznl.zzb;
            obj.getClass();
            map.get(obj).getClass();
        }
        super/*java.util.AbstractMap*/.putAll(map);
    }

    public final Object remove(Object obj) {
        zzg();
        return super/*java.util.AbstractMap*/.remove(obj);
    }

    public final zzoc zzb() {
        return isEmpty() ? new zzoc() : new zzoc(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzoc zzocVar) {
        zzg();
        if (zzocVar.isEmpty()) {
            return;
        }
        putAll(zzocVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzoc(Map map) {
        super(map);
        this.zzb = true;
    }
}
