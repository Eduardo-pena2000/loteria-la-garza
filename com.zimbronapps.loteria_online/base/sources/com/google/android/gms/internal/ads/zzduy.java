package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzduy extends FrameLayout {
    private final V5.u zza;

    public zzduy(Context context, View view, V5.u uVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = uVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            zzcjl childAt = getChildAt(i);
            if (childAt instanceof zzcjl) {
                arrayList.add(childAt);
            }
        }
        super/*android.view.ViewGroup*/.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzcjl) arrayList.get(i2)).destroy();
        }
    }
}
