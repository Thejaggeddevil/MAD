package com.mansi.login;

import android.content.Context;
import android.graphics.*;
import android.view.View;

public class MyView extends View {

    Paint paint;

    public MyView(Context context) {
        super(context);

        paint = new Paint();
        paint.setAntiAlias(true); // smooth edges
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Background color
        canvas.drawColor(Color.WHITE);

        // 🔴 LINE
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8);
        canvas.drawLine(100, 150, 800, 150, paint);

        // 🔵 RECTANGLE (filled)
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(100, 200, 600, 400, paint);

        // 🟢 CIRCLE
        paint.setColor(Color.GREEN);
        canvas.drawCircle(350, 600, 120, paint);

        // 🟡 TEXT (bonus marks)
        paint.setColor(Color.BLACK);
        paint.setTextSize(60);
        canvas.drawText("Graphics Demo", 100, 800, paint);
    }
}