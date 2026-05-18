package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgui implements Map, Serializable {
    private transient zzgup zza;
    private transient zzgup zzb;
    private transient zzgub zzc;

    public static zzgui zza() {
        return zzgwf.zza;
    }

    public static zzgui zzb(Object obj, Object obj2) {
        zzgtb.zza("dialog_not_shown_reason", obj2);
        return zzgwf.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgui zzc(Map map) {
        if ((map instanceof zzgui) && !(map instanceof SortedMap)) {
            zzgui zzguiVar = (zzgui) map;
            zzguiVar.zzj();
            return zzguiVar;
        }
        Collection entrySet = map.entrySet();
        zzguh zzguhVar = new zzguh(entrySet instanceof Collection ? entrySet.size() : 4);
        zzguhVar.zzb(entrySet);
        return zzguhVar.zzc();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        return zzgvm.zzb(this, obj);
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzgwp.zzc(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzgtb.zzb(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgup entrySet() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgup zze = zze();
        this.zza = zze;
        return zze;
    }

    public abstract zzgup zze();

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgup keySet() {
        zzgup zzgupVar = this.zzb;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgup zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }

    public abstract zzgup zzg();

    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgub values() {
        zzgub zzgubVar = this.zzc;
        if (zzgubVar != null) {
            return zzgubVar;
        }
        zzgub zzi = zzi();
        this.zzc = zzi;
        return zzi;
    }

    public abstract zzgub zzi();

    public abstract boolean zzj();
}
