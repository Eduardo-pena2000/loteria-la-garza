package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b {
    public boolean a;
    public String b;
    public a c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, a aVar, Object obj, boolean z) {
        this.b = str;
        this.c = aVar;
        this.a = z;
        d(obj);
    }

    public static HashMap a(HashMap hashMap, View view) {
        HashMap hashMap2 = new HashMap();
        Class cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new b(bVar, Integer.valueOf(view.getBackground().getColor())));
                } else {
                    hashMap2.put(str, new b(bVar, cls.getMethod("getMap" + str, (Class[]) null).invoke(view, (Object[]) null)));
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e3);
            }
        }
        return hashMap2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        a aVar;
        Boolean valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), E1.d.S3);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Boolean bool = null;
        a aVar2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == E1.d.T3) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == E1.d.d4) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == E1.d.U3) {
                bool = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == E1.d.W3) {
                    aVar = a.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == E1.d.V3) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == E1.d.a4) {
                    aVar = a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == E1.d.X3) {
                    aVar = a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == E1.d.Y3) {
                    aVar = a.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == E1.d.Z3) {
                    aVar = a.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == E1.d.c4) {
                    aVar = a.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == E1.d.b4) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Boolean bool2 = valueOf;
                aVar2 = aVar;
                bool = bool2;
            }
        }
        if (str != null && bool != null) {
            hashMap.put(str, new b(str, aVar2, bool, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap hashMap) {
        Class cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str);
            String str2 = bVar.a ? str : "set" + str;
            try {
                switch (bVar.c) {
                    case INT_TYPE:
                        cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.d)});
                        break;
                    case FLOAT_TYPE:
                        cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(bVar.e)});
                        break;
                    case COLOR_TYPE:
                        cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.h)});
                        break;
                    case COLOR_DRAWABLE_TYPE:
                        Method method = cls.getMethod(str2, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case STRING_TYPE:
                        cls.getMethod(str2, new Class[]{CharSequence.class}).invoke(view, new Object[]{bVar.f});
                        break;
                    case BOOLEAN_TYPE:
                        cls.getMethod(str2, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(bVar.g)});
                        break;
                    case DIMENSION_TYPE:
                        cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(bVar.e)});
                        break;
                    case REFERENCE_TYPE:
                        cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.d)});
                        break;
                }
            } catch (InvocationTargetException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
            } catch (IllegalAccessException e2) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e2);
            } catch (NoSuchMethodException e3) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e3);
            }
        }
    }

    public void d(Object obj) {
        switch (this.c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }

    public b(b bVar, Object obj) {
        this.a = false;
        this.b = bVar.b;
        this.c = bVar.c;
        d(obj);
    }
}
