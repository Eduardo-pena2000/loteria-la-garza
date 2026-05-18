package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i extends e {
    private static final Paint c = new Paint(1);
    private static final Paint d = new Paint(1);

    public i(Context context) {
        super(context);
        c.setARGB(80, 0, 0, 0);
        Paint paint = d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public void a(int i) {
        setViewScale(i / 30.0f);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.a * 8.0f;
    }

    public float getStrokeWidth() {
        return this.a * 2.0f;
    }

    public e.a getStyle() {
        return e.a.WHITE_ON_TRANSPARENT;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
