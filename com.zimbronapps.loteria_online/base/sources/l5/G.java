package L5;

import S5.M1;
import S5.Q;
import S5.U;
import S5.d2;
import S5.e2;
import S5.n1;
import S5.p2;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxh;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g {
    public final p2 a;
    public final Context b;
    public final Q c;

    public static class a {
        public final Context a;
        public final U b;

        public a(Context context, String str) {
            Context context2 = (Context) com.google.android.gms.common.internal.t.m(context, "context cannot be null");
            U c = S5.B.b().c(context, str, new zzbtp());
            this.a = context2;
            this.b = c;
        }

        public g a() {
            try {
                return new g(this.a, this.b.zze(), p2.a);
            } catch (RemoteException e) {
                W5.p.d("Failed to build AdLoader.", e);
                return new g(this.a, new M1().q1(), p2.a);
            }
        }

        public a b(NativeAd.c cVar) {
            try {
                this.b.zzm(new zzbxh(cVar));
            } catch (RemoteException e) {
                W5.p.g("Failed to add google native ad listener", e);
            }
            return this;
        }

        public a c(e eVar) {
            try {
                this.b.zzf(new d2(eVar));
            } catch (RemoteException e) {
                W5.p.g("Failed to set AdListener.", e);
            }
            return this;
        }

        public a d(com.google.android.gms.ads.nativead.b bVar) {
            try {
                this.b.zzj(new zzbkh(4, bVar.e(), -1, bVar.d(), bVar.a(), bVar.c() != null ? new e2(bVar.c()) : null, bVar.f(), bVar.b(), bVar.g(), bVar.h(), bVar.i() - 1));
            } catch (RemoteException e) {
                W5.p.g("Failed to specify native ad options", e);
            }
            return this;
        }

        public final a e(O5.o oVar) {
            try {
                this.b.zzm(new zzbmv(oVar));
            } catch (RemoteException e) {
                W5.p.g("Failed to add google native ad listener", e);
            }
            return this;
        }

        public final a f(String str, O5.m mVar, O5.l lVar) {
            zzbms zzbmsVar = new zzbms(mVar, lVar);
            try {
                this.b.zzi(str, zzbmsVar.zza(), zzbmsVar.zzb());
            } catch (RemoteException e) {
                W5.p.g("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public final a g(O5.e eVar) {
            try {
                this.b.zzj(new zzbkh(eVar));
            } catch (RemoteException e) {
                W5.p.g("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public g(Context context, Q q, p2 p2Var) {
        this.b = context;
        this.c = q;
        this.a = p2Var;
    }

    public void a(M5.a aVar) {
        d(aVar.a);
    }

    public void b(AdRequest adRequest) {
        d(adRequest.a);
    }

    public final /* synthetic */ void c(n1 n1Var) {
        try {
            this.c.zze(this.a.a(this.b, n1Var));
        } catch (RemoteException e) {
            W5.p.d("Failed to load ad.", e);
        }
    }

    public final void d(n1 n1Var) {
        Context context = this.b;
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzc.zze()).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                W5.c.b.execute(new D(this, n1Var));
                return;
            }
        }
        try {
            this.c.zze(this.a.a(context, n1Var));
        } catch (RemoteException e) {
            W5.p.d("Failed to load ad.", e);
        }
    }
}
