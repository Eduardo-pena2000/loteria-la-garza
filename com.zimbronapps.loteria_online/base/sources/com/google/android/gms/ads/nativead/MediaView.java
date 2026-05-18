package com.google.android.gms.ads.nativead;

import L5.o;
import W5.p;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzblm;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MediaView extends FrameLayout {
    public o a;
    public boolean b;
    public zzbke c;
    public ImageView.ScaleType d;
    public boolean e;
    public zzbkg f;

    public MediaView(Context context) {
        super(context);
    }

    public final synchronized void a(zzbke zzbkeVar) {
        this.c = zzbkeVar;
        if (this.b) {
            zzbkeVar.zza(this.a);
        }
    }

    public final synchronized void b(zzbkg zzbkgVar) {
        this.f = zzbkgVar;
        if (this.e) {
            zzbkgVar.zza(this.d);
        }
    }

    public o getMediaContent() {
        return this.a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.e = true;
        this.d = scaleType;
        zzbkg zzbkgVar = this.f;
        if (zzbkgVar != null) {
            zzbkgVar.zza(scaleType);
        }
    }

    public void setMediaContent(o oVar) {
        boolean zzt;
        this.b = true;
        this.a = oVar;
        zzbke zzbkeVar = this.c;
        if (zzbkeVar != null) {
            zzbkeVar.zza(oVar);
        }
        if (oVar == null) {
            return;
        }
        try {
            zzblm zzb = oVar.zzb();
            if (zzb != null) {
                if (!oVar.a()) {
                    if (oVar.zza()) {
                        zzt = zzb.zzt(N6.b.s1(this));
                    }
                    removeAllViews();
                }
                zzt = zzb.zzn(N6.b.s1(this));
                if (zzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            p.d("", e);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
