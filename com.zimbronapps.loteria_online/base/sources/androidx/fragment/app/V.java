package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v {
    public static int a(p pVar, boolean z, boolean z2) {
        return z2 ? z ? pVar.getPopEnterAnim() : pVar.getPopExitAnim() : z ? pVar.getEnterAnim() : pVar.getExitAnim();
    }

    public static a b(Context context, p pVar, boolean z, boolean z2) {
        int nextTransition = pVar.getNextTransition();
        int a2 = a(pVar, z, z2);
        pVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = pVar.mContainer;
        if (viewGroup != null && viewGroup.getTag(x2.b.c) != null) {
            pVar.mContainer.setTag(x2.b.c, (Object) null);
        }
        ViewGroup viewGroup2 = pVar.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = pVar.onCreateAnimation(nextTransition, z, a2);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = pVar.onCreateAnimator(nextTransition, z, a2);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a2 == 0 && nextTransition != 0) {
            a2 = d(context, nextTransition, z);
        }
        if (a2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a2);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    public static int c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? x2.a.e : x2.a.f;
        }
        if (i == 8194) {
            return z ? x2.a.a : x2.a.b;
        }
        if (i == 8197) {
            return z ? c(context, 16842938) : c(context, 16842939);
        }
        if (i == 4099) {
            return z ? x2.a.c : x2.a.d;
        }
        if (i != 4100) {
            return -1;
        }
        return z ? c(context, 16842936) : c(context, 16842937);
    }

    public static class a {
        public final Animation a;
        public final AnimatorSet b;

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup a;
        public final View b;
        public boolean c;
        public boolean d;
        public boolean e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.e = true;
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.c = true;
                T1.K.a(this.a, this);
            }
            return true;
        }

        public void run() {
            if (this.c || !this.e) {
                this.a.endViewTransition(this.b);
                this.d = true;
            } else {
                this.e = false;
                this.a.post(this);
            }
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super/*android.view.animation.Animation*/.getTransformation(j, transformation, f)) {
                this.c = true;
                T1.K.a(this.a, this);
            }
            return true;
        }
    }
}
