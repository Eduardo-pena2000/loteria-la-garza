package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbkb extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzb;

    public zzbkb(Context context, zzbka zzbkaVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        com.google.android.gms.common.internal.t.l(zzbkaVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(zzbkaVar.zze());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbkaVar.zzb())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbkaVar.zzb());
            textView.setTextColor(zzbkaVar.zzf());
            textView.setTextSize(zzbkaVar.zzg());
            S5.B.a();
            int c = W5.g.c(context, 4);
            S5.B.a();
            textView.setPadding(c, 0, W5.g.c(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List zzd = zzbkaVar.zzd();
        if (zzd != null && zzd.size() > 1) {
            this.zzb = new AnimationDrawable();
            Iterator it = zzd.iterator();
            while (it.hasNext()) {
                try {
                    this.zzb.addFrame((Drawable) N6.b.r1(((zzbkd) it.next()).zzb()), zzbkaVar.zzh());
                } catch (Exception e) {
                    int i = o0.b;
                    W5.p.d("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (zzd.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) N6.b.r1(((zzbkd) zzd.get(0)).zzb()));
            } catch (Exception e2) {
                int i2 = o0.b;
                W5.p.d("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super/*android.view.View*/.onAttachedToWindow();
    }
}
