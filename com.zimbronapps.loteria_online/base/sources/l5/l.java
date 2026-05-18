package L5;

import S5.q1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class l extends ViewGroup {
    public final q1 a;

    public l(Context context, int i) {
        super(context);
        this.a = new q1(this, i);
    }

    public void a() {
        zzbhe.zza(getContext());
        if (((Boolean) zzbjc.zze.zze()).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmC)).booleanValue()) {
                W5.c.b.execute(new J(this));
                return;
            }
        }
        this.a.h();
    }

    public void b(AdRequest adRequest) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        zzbhe.zza(getContext());
        if (((Boolean) zzbjc.zzf.zze()).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                W5.c.b.execute(new G(this, adRequest));
                return;
            }
        }
        this.a.n(adRequest.a);
    }

    public void c() {
        zzbhe.zza(getContext());
        if (((Boolean) zzbjc.zzg.zze()).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmD)).booleanValue()) {
                W5.c.b.execute(new H(this));
                return;
            }
        }
        this.a.o();
    }

    public void d() {
        zzbhe.zza(getContext());
        if (((Boolean) zzbjc.zzh.zze()).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmB)).booleanValue()) {
                W5.c.b.execute(new I(this));
                return;
            }
        }
        this.a.p();
    }

    public e getAdListener() {
        return this.a.i();
    }

    public h getAdSize() {
        return this.a.j();
    }

    public String getAdUnitId() {
        return this.a.l();
    }

    public t getOnPaidEventListener() {
        return this.a.B();
    }

    public long getPlacementId() {
        return this.a.z();
    }

    public z getResponseInfo() {
        return this.a.x();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    public void onMeasure(int i, int i2) {
        h hVar;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e) {
                W5.p.d("Unable to retrieve ad size.", e);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int k = hVar.k(context);
                i3 = hVar.d(context);
                i4 = k;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(e eVar) {
        q1 q1Var = this.a;
        q1Var.q(eVar);
        if (eVar == 0) {
            q1Var.r(null);
            return;
        }
        if (eVar instanceof S5.a) {
            q1Var.r((S5.a) eVar);
        }
        if (eVar instanceof M5.e) {
            q1Var.v((M5.e) eVar);
        }
    }

    public void setAdSize(h hVar) {
        this.a.s(hVar);
    }

    public void setAdUnitId(String str) {
        this.a.u(str);
    }

    public void setOnPaidEventListener(t tVar) {
        this.a.y(tVar);
    }

    public void setPlacementId(long j) {
        this.a.A(j);
    }
}
