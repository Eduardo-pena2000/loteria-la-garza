package R5;

import V5.o0;
import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfkm;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o extends WebViewClient {
    public final /* synthetic */ s a;

    public o(s sVar) {
        Objects.requireNonNull(sVar);
        this.a = sVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        s sVar = this.a;
        if (sVar.w1() != null) {
            try {
                sVar.w1().zzd(zzfkm.zzd(1, null, null));
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
        s sVar2 = this.a;
        if (sVar2.w1() != null) {
            try {
                sVar2.w1().zzc(0);
            } catch (RemoteException e2) {
                int i2 = o0.b;
                W5.p.i("#007 Could not call remote method.", e2);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        s sVar = this.a;
        if (str.startsWith(sVar.t1())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (sVar.w1() != null) {
                try {
                    sVar.w1().zzd(zzfkm.zzd(3, null, null));
                } catch (RemoteException e) {
                    int i = o0.b;
                    W5.p.i("#007 Could not call remote method.", e);
                }
            }
            s sVar2 = this.a;
            if (sVar2.w1() != null) {
                try {
                    sVar2.w1().zzc(3);
                } catch (RemoteException e2) {
                    int i2 = o0.b;
                    W5.p.i("#007 Could not call remote method.", e2);
                }
            }
            this.a.r1(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            s sVar3 = this.a;
            if (sVar3.w1() != null) {
                try {
                    sVar3.w1().zzd(zzfkm.zzd(1, null, null));
                } catch (RemoteException e3) {
                    int i3 = o0.b;
                    W5.p.i("#007 Could not call remote method.", e3);
                }
            }
            s sVar4 = this.a;
            if (sVar4.w1() != null) {
                try {
                    sVar4.w1().zzc(0);
                } catch (RemoteException e4) {
                    int i4 = o0.b;
                    W5.p.i("#007 Could not call remote method.", e4);
                }
            }
            this.a.r1(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            s sVar5 = this.a;
            if (sVar5.w1() != null) {
                try {
                    sVar5.w1().zzf();
                } catch (RemoteException e5) {
                    int i5 = o0.b;
                    W5.p.i("#007 Could not call remote method.", e5);
                }
            }
            s sVar6 = this.a;
            sVar6.r1(sVar6.q1(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        s sVar7 = this.a;
        if (sVar7.w1() != null) {
            try {
                sVar7.w1().zzh();
                sVar7.w1().zze();
            } catch (RemoteException e6) {
                int i6 = o0.b;
                W5.p.i("#007 Could not call remote method.", e6);
            }
        }
        this.a.u1(str);
        return true;
    }
}
