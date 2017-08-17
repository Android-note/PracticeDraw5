package com.hencoder.hencoderpracticedraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.hencoder.hencoderpracticedraw5.R;

public class Practice06BeforeOnDrawForegroundView extends AppCompatImageView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice06BeforeOnDrawForegroundView(Context context) {
        super(context);
    }

    public Practice06BeforeOnDrawForegroundView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice06BeforeOnDrawForegroundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        // 在 super.onDrawForeground() 的上方插入绘制代码，让绘制内容被前景盖住
        // 由于这期的重点是绘制代码的位置而不是绘制代码本身，所以直接给出绘制代码，你只要解除注释就好
        paint.setColor(ContextCompat.getColor(getContext(), R.color.red));
        canvas.drawRect(0, 40, 200, 120, paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("New", 20, 100, paint);

        super.onDrawForeground(canvas);
    }
}
