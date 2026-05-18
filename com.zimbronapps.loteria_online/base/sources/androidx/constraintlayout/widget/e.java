package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e extends View {
    public boolean a;

    public e(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.b layoutParams = getLayoutParams();
        if (this.a && layoutParams.a == i) {
            return;
        }
        layoutParams.a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.b layoutParams = getLayoutParams();
        if (this.a && layoutParams.b == i) {
            return;
        }
        layoutParams.b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.b layoutParams = getLayoutParams();
        if (this.a && layoutParams.c == f) {
            return;
        }
        layoutParams.c = f;
        setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
    }
}
