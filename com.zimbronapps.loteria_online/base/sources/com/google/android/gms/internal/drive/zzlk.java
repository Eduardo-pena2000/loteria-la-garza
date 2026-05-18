package com.google.android.gms.internal.drive;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzlk extends LinkedHashMap {
    private static final zzlk zzty;
    private boolean zznh;

    static {
        zzlk zzlkVar = new zzlk();
        zzty = zzlkVar;
        zzlkVar.zznh = false;
    }

    private zzlk() {
        this.zznh = true;
    }

    public static zzlk zzdw() {
        return zzty;
    }

    private final void zzdy() {
        if (!this.zznh) {
            throw new UnsupportedOperationException();
        }
    }

    private static int zzg(Object obj) {
        if (obj instanceof byte[]) {
            return zzkm.hashCode((byte[]) obj);
        }
        if (obj instanceof zzkn) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final void clear() {
        zzdy();
        super.clear();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = r1
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = r0
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlk.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzg(entry.getValue()) ^ zzg(entry.getKey());
        }
        return i;
    }

    public final boolean isMutable() {
        return this.zznh;
    }

    public final Object put(Object obj, Object obj2) {
        zzdy();
        zzkm.checkNotNull(obj);
        zzkm.checkNotNull(obj2);
        return super/*java.util.AbstractMap*/.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzdy();
        for (Object obj : map.keySet()) {
            zzkm.checkNotNull(obj);
            zzkm.checkNotNull(map.get(obj));
        }
        super/*java.util.AbstractMap*/.putAll(map);
    }

    public final Object remove(Object obj) {
        zzdy();
        return super/*java.util.AbstractMap*/.remove(obj);
    }

    public final void zza(zzlk zzlkVar) {
        zzdy();
        if (zzlkVar.isEmpty()) {
            return;
        }
        putAll(zzlkVar);
    }

    public final void zzbp() {
        this.zznh = false;
    }

    public final zzlk zzdx() {
        return isEmpty() ? new zzlk() : new zzlk(this);
    }

    private zzlk(Map map) {
        super(map);
        this.zznh = true;
    }
}
