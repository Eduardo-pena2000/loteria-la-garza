package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FlutterMutatorsStack {
    private List mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new a(path));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i, int i2, int i3, int i4, float[] fArr) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f) {
        this.mutators.add(new a(f));
        this.finalOpacity *= f;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }

    public class a {
        public Matrix a;
        public Rect b;
        public Path c;
        public float[] d;
        public float e;
        public b f;

        public a(Rect rect) {
            this.e = 1.0f;
            this.f = b.CLIP_RECT;
            this.b = rect;
        }

        public Matrix a() {
            return this.a;
        }

        public a(Rect rect, float[] fArr) {
            this.e = 1.0f;
            this.f = b.CLIP_RRECT;
            this.b = rect;
            this.d = fArr;
        }

        public a(Path path) {
            this.e = 1.0f;
            this.f = b.CLIP_PATH;
            this.c = path;
        }

        public a(Matrix matrix) {
            this.e = 1.0f;
            this.f = b.TRANSFORM;
            this.a = matrix;
        }

        public a(float f) {
            this.e = 1.0f;
            this.f = b.OPACITY;
            this.e = f;
        }
    }
}
