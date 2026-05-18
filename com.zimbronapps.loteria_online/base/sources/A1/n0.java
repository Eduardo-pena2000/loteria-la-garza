package a1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n0 extends Canvas {
    public Canvas a;

    public final void a(Canvas canvas) {
        this.a = canvas;
    }

    public boolean clipOutPath(Path path) {
        s sVar = s.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return sVar.a(canvas, path);
    }

    public boolean clipOutRect(RectF rectF) {
        s sVar = s.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return sVar.e(canvas, rectF);
    }

    public boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    public boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    public void concat(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    public void disableZ() {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.a(canvas);
    }

    public void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i, i2, i3, i4);
    }

    public void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f, f2, z, paint);
    }

    public void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f, f2, paint);
    }

    public void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    public void drawCircle(float f, float f2, float f3, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f, f2, f3, paint);
    }

    public void drawColor(int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i);
    }

    public void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.e(canvas, rectF, f, f2, rectF2, f3, f4, paint);
    }

    public void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        H h = H.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        h.a(canvas, iArr, i, fArr, i2, i3, font, paint);
    }

    public void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f, f2, f3, f4, paint);
    }

    public void drawLines(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i, i2, paint);
    }

    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    public void drawPaint(Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        H h = H.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        h.b(canvas, ninePatch, rect, paint);
    }

    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    public void drawPicture(Picture picture) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    public void drawPoint(float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f, f2, paint);
    }

    public void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i, i2, paint);
    }

    public void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i, i2, fArr, paint);
    }

    public void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i, i2, i3);
    }

    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    public void drawRenderNode(RenderNode renderNode) {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.g(canvas, renderNode);
    }

    public void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f, f2, paint);
    }

    public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i, i2, f, f2, paint);
    }

    public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        m mVar = m.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        mVar.b(canvas, cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    public void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    public void enableZ() {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.i(canvas);
    }

    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public int getDensity() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    public DrawFilter getDrawFilter() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    public int getHeight() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    public int getMaximumBitmapHeight() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    public int getWidth() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    public boolean isOpaque() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    public void restore() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    public void restoreToCount(int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i);
    }

    public void rotate(float f) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f);
    }

    public int save() {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    public int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i);
    }

    public int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i, i2);
    }

    public void scale(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f, f2);
    }

    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public void setDensity(int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i);
    }

    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    public void skew(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f, f2);
    }

    public void translate(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f, f2);
    }

    public boolean clipOutRect(Rect rect) {
        s sVar = s.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return sVar.d(canvas, rect);
    }

    public boolean clipPath(Path path) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    public boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    public void drawColor(long j) {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.c(canvas, j);
    }

    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f, f2, f3, f4, paint);
    }

    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        H h = H.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        h.c(canvas, ninePatch, rectF, paint);
    }

    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    public void drawText(String str, float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f, f2, paint);
    }

    public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f, f2, paint);
    }

    public boolean quickReject(RectF rectF) {
        D d = D.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return d.c(canvas, rectF);
    }

    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    public int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i);
    }

    public boolean clipOutRect(float f, float f2, float f3, float f4) {
        s sVar = s.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return sVar.b(canvas, f, f2, f3, f4);
    }

    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    public void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i, mode);
    }

    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i, i2, f, f2, paint);
    }

    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    public int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint, i);
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    public boolean clipOutRect(int i, int i2, int i3, int i4) {
        s sVar = s.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return sVar.c(canvas, i, i2, i3, i4);
    }

    public boolean clipRect(Rect rect) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    public void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    public void drawColor(int i, BlendMode blendMode) {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.b(canvas, i, blendMode);
    }

    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        m mVar = m.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        mVar.a(canvas, charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    public boolean quickReject(Path path) {
        D d = D.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return d.b(canvas, path);
    }

    public int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint);
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    public boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4, op);
    }

    public void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    public void drawColor(long j, BlendMode blendMode) {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.d(canvas, j, blendMode);
    }

    public boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f, f2, f3, f4, edgeType);
    }

    public boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4);
    }

    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public boolean quickReject(float f, float f2, float f3, float f4) {
        D d = D.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return d.a(canvas, f, f2, f3, f4);
    }

    public boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i, i2, i3, i4);
    }

    public void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        z zVar = z.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.t.v("nativeCanvas");
            canvas = null;
        }
        zVar.h(canvas, measuredText, i, i2, i3, i4, f, f2, z, paint);
    }
}
