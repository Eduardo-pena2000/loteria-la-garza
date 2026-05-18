package com.google.android.gms.internal.drive;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzmi extends AbstractMap {
    private boolean zzot;
    private final int zzvd;
    private List zzve;
    private Map zzvf;
    private volatile zzmr zzvg;
    private Map zzvh;
    private volatile zzml zzvi;

    private zzmi(int i) {
        this.zzvd = i;
        this.zzve = Collections.emptyList();
        this.zzvf = Collections.emptyMap();
        this.zzvh = Collections.emptyMap();
    }

    public static zzmi zzav(int i) {
        return new zzmj(i);
    }

    private final Object zzax(int i) {
        zzeu();
        Object value = ((zzmp) this.zzve.remove(i)).getValue();
        if (!this.zzvf.isEmpty()) {
            Iterator it = zzev().entrySet().iterator();
            this.zzve.add(new zzmp(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public static /* synthetic */ List zzb(zzmi zzmiVar) {
        return zzmiVar.zzve;
    }

    public static /* synthetic */ Map zzc(zzmi zzmiVar) {
        return zzmiVar.zzvf;
    }

    public static /* synthetic */ Map zzd(zzmi zzmiVar) {
        return zzmiVar.zzvh;
    }

    private final void zzeu() {
        if (this.zzot) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap zzev() {
        zzeu();
        if (this.zzvf.isEmpty() && !(this.zzvf instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzvf = treeMap;
            this.zzvh = treeMap.descendingMap();
        }
        return this.zzvf;
    }

    public void clear() {
        zzeu();
        if (!this.zzve.isEmpty()) {
            this.zzve.clear();
        }
        if (this.zzvf.isEmpty()) {
            return;
        }
        this.zzvf.clear();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzvf.containsKey(comparable);
    }

    public Set entrySet() {
        if (this.zzvg == null) {
            this.zzvg = new zzmr(this, null);
        }
        return this.zzvg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmi)) {
            return super.equals(obj);
        }
        zzmi zzmiVar = (zzmi) obj;
        int size = size();
        if (size != zzmiVar.size()) {
            return false;
        }
        int zzer = zzer();
        if (zzer != zzmiVar.zzer()) {
            return entrySet().equals(zzmiVar.entrySet());
        }
        for (int i = 0; i < zzer; i++) {
            if (!zzaw(i).equals(zzmiVar.zzaw(i))) {
                return false;
            }
        }
        if (zzer != size) {
            return this.zzvf.equals(zzmiVar.zzvf);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? ((zzmp) this.zzve.get(zza)).getValue() : this.zzvf.get(comparable);
    }

    public int hashCode() {
        int zzer = zzer();
        int i = 0;
        for (int i2 = 0; i2 < zzer; i2++) {
            i += ((zzmp) this.zzve.get(i2)).hashCode();
        }
        return this.zzvf.size() > 0 ? i + this.zzvf.hashCode() : i;
    }

    public final boolean isImmutable() {
        return this.zzot;
    }

    public Object remove(Object obj) {
        zzeu();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzax(zza);
        }
        if (this.zzvf.isEmpty()) {
            return null;
        }
        return this.zzvf.remove(comparable);
    }

    public int size() {
        return this.zzve.size() + this.zzvf.size();
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzeu();
        int zza = zza(comparable);
        if (zza >= 0) {
            return ((zzmp) this.zzve.get(zza)).setValue(obj);
        }
        zzeu();
        if (this.zzve.isEmpty() && !(this.zzve instanceof ArrayList)) {
            this.zzve = new ArrayList(this.zzvd);
        }
        int i = -(zza + 1);
        if (i >= this.zzvd) {
            return zzev().put(comparable, obj);
        }
        int size = this.zzve.size();
        int i2 = this.zzvd;
        if (size == i2) {
            zzmp zzmpVar = (zzmp) this.zzve.remove(i2 - 1);
            zzev().put((Comparable) zzmpVar.getKey(), zzmpVar.getValue());
        }
        this.zzve.add(i, new zzmp(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzaw(int i) {
        return (Map.Entry) this.zzve.get(i);
    }

    public void zzbp() {
        if (this.zzot) {
            return;
        }
        this.zzvf = this.zzvf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzvf);
        this.zzvh = this.zzvh.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzvh);
        this.zzot = true;
    }

    public final int zzer() {
        return this.zzve.size();
    }

    public final Iterable zzes() {
        return this.zzvf.isEmpty() ? zzmm.zzex() : this.zzvf.entrySet();
    }

    public final Set zzet() {
        if (this.zzvi == null) {
            this.zzvi = new zzml(this, null);
        }
        return this.zzvi;
    }

    public /* synthetic */ zzmi(int i, zzmj zzmjVar) {
        this(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.zzve
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L25
            java.util.List r2 = r4.zzve
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.drive.zzmp r2 = (com.google.android.gms.internal.drive.zzmp) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L22
            int r0 = r0 + 1
        L20:
            int r5 = -r0
            return r5
        L22:
            if (r2 != 0) goto L25
            return r1
        L25:
            r0 = 0
        L26:
            if (r0 > r1) goto L49
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.zzve
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.drive.zzmp r3 = (com.google.android.gms.internal.drive.zzmp) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L43
            int r1 = r2 + (-1)
            goto L26
        L43:
            if (r3 <= 0) goto L48
            int r0 = r2 + 1
            goto L26
        L48:
            return r2
        L49:
            int r0 = r0 + 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzmi.zza(java.lang.Comparable):int");
    }

    public static /* synthetic */ void zza(zzmi zzmiVar) {
        zzmiVar.zzeu();
    }

    public static /* synthetic */ Object zza(zzmi zzmiVar, int i) {
        return zzmiVar.zzax(i);
    }
}
