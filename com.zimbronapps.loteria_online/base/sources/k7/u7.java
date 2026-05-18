package k7;

import com.google.android.gms.internal.measurement.zzhf;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzij;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u7 {
    public String a;
    public boolean b;
    public zzii c;
    public BitSet d;
    public BitSet e;
    public Map f;
    public Map g;
    public final /* synthetic */ e h;

    public /* synthetic */ u7(e eVar, String str, zzii zziiVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.h = eVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new w.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = zziiVar;
    }

    public final void a(c cVar) {
        int a = cVar.a();
        if (cVar.c != null) {
            this.e.set(a, true);
        }
        Boolean bool = cVar.d;
        if (bool != null) {
            this.d.set(a, bool.booleanValue());
        }
        if (cVar.e != null) {
            Map map = this.f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = cVar.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (cVar.f != null) {
            Map map2 = this.g;
            Integer valueOf2 = Integer.valueOf(a);
            ArrayList arrayList = (List) map2.get(valueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.g.put(valueOf2, arrayList);
            }
            if (cVar.b()) {
                arrayList.clear();
            }
            zzpu.zza();
            q3 q3Var = this.h.a;
            m w = q3Var.w();
            String str = this.a;
            e2 e2Var = f2.G0;
            if (w.H(str, e2Var) && cVar.c()) {
                arrayList.clear();
            }
            zzpu.zza();
            if (!q3Var.w().H(this.a, e2Var)) {
                arrayList.add(Long.valueOf(cVar.f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(cVar.f.longValue() / 1000);
            if (arrayList.contains(valueOf3)) {
                return;
            }
            arrayList.add(valueOf3);
        }
    }

    public final zzhg b(int i) {
        Iterable iterable;
        List list;
        zzhf zzh = zzhg.zzh();
        zzh.zza(i);
        zzh.zzd(this.b);
        zzii zziiVar = this.c;
        if (zziiVar != null) {
            zzh.zzc(zziiVar);
        }
        zzih zzi = zzii.zzi();
        zzi.zzc(g7.Q(this.d));
        zzi.zza(g7.Q(this.e));
        Map map = this.f;
        if (map == null) {
            iterable = null;
        } else {
            Iterable arrayList = new ArrayList(map.size());
            for (Integer num : this.f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f.get(num);
                if (l != null) {
                    zzhp zze = zzhq.zze();
                    zze.zza(intValue);
                    zze.zzb(l.longValue());
                    arrayList.add((zzhq) zze.zzbc());
                }
            }
            iterable = arrayList;
        }
        if (iterable != null) {
            zzi.zze(iterable);
        }
        Map map2 = this.g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            List arrayList2 = new ArrayList(map2.size());
            for (Integer num2 : this.g.keySet()) {
                zzij zzf = zzik.zzf();
                zzf.zza(num2.intValue());
                List list2 = (List) this.g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzf.zzb(list2);
                }
                arrayList2.add((zzik) zzf.zzbc());
            }
            list = arrayList2;
        }
        zzi.zzg(list);
        zzh.zzb(zzi);
        return (zzhg) zzh.zzbc();
    }

    public final /* synthetic */ BitSet c() {
        return this.d;
    }

    public /* synthetic */ u7(e eVar, String str, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.h = eVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new w.a();
        this.g = new w.a();
    }
}
