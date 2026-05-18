package u5;

import Y5.t;
import com.google.ads.mediation.unity.a;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a {
    public final t a;
    public final MediationInterstitialAdapter b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.b.values().length];
            a = iArr;
            try {
                iArr[a.b.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.b.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.b.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.b.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.b.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(t tVar, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.a = tVar;
        this.b = mediationInterstitialAdapter;
    }

    public void a(a.b bVar) {
        if (this.a == null) {
            return;
        }
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            this.a.onAdLoaded(this.b);
            return;
        }
        if (i == 2) {
            this.a.onAdOpened(this.b);
            return;
        }
        if (i == 3) {
            this.a.onAdClicked(this.b);
        } else if (i == 4) {
            this.a.onAdClosed(this.b);
        } else {
            if (i != 5) {
                return;
            }
            this.a.onAdLeftApplication(this.b);
        }
    }
}
