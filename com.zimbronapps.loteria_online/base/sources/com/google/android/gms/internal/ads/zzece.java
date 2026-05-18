package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzece {
    public static final void zza(Context context, ViewGroup viewGroup, L5.j jVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        zzf(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(jVar);
        jVar.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void zzb(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        zzf(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        zzf(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources zzf = R5.t.l().zzf();
        linearLayout.addView(zzc(context, zzf == null ? "Headline" : zzf.getString(Q5.d.b), "headline_header_tag"));
        TextView zzd = zzd(context, zzgrt.zza(nativeAd.getHeadline()), "headline_tag");
        nativeAdView.setHeadlineView(zzd);
        linearLayout.addView(zzd);
        linearLayout.addView(zzc(context, zzf == null ? "Body" : zzf.getString(Q5.d.a), "body_header_tag"));
        TextView zzd2 = zzd(context, zzgrt.zza(nativeAd.getBody()), "body_tag");
        nativeAdView.setBodyView(zzd2);
        linearLayout.addView(zzd2);
        linearLayout.addView(zzc(context, zzf == null ? "Media View" : zzf.getString(Q5.d.c), "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
    }

    private static TextView zzc(Context context, String str, String str2) {
        return zze(context, str, 16973894, -9210245, 0.0f, str2);
    }

    private static TextView zzd(Context context, String str, String str2) {
        return zze(context, str, 16973892, -16777216, 12.0f, str2);
    }

    private static TextView zze(Context context, String str, int i, int i2, float f, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        zzf(textView, -2, -2);
        TableRow.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i2);
        textView.setText(str);
        return textView;
    }

    private static void zzf(View view, int i, int i2) {
        TableRow.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i2;
        view.setLayoutParams(layoutParams2);
    }
}
